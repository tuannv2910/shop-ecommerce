package shop.ecommerce.config.sercurity;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
import shop.ecommerce.utils.constants.ShopConst;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CustomAuthorizationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest
                                            request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("starter filter");
        // đầu tiên là phải check các enpoint không cần security
        if (checkAuthEndPoint(
                request
        )) {
            filterChain.doFilter(request
                    , response);
        } else { // phải check
            String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
            if (authorizationHeader != null && authorizationHeader.startsWith(ShopConst.BEARER_SPACE)) { // nếu là token hợp lệ
                try {
                    String token = authorizationHeader.substring(ShopConst.BEARER_SPACE.length());// lấy ra token
                    Algorithm algorithm = Algorithm.HMAC256(ShopConst.JWT_SECRET.getBytes());
                    JWTVerifier jwtVerifier = JWT.require(algorithm).build();
                    final DecodedJWT decodeJwt = jwtVerifier.verify(token);
                    final Claim id = decodeJwt.getClaim("id");
                    final Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
                    authorities.add(new SimpleGrantedAuthority("role"));
                    final UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(id, null, authorities);
                    SecurityContextHolder.getContext().setAuthentication(authenticationToken);
                    filterChain.doFilter(request, response);
                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }
        }
    }

    private boolean checkAuthEndPoint(HttpServletRequest request) {
        List<String> noAuthEndPoints = Arrays.asList(
                "/api/v1/login",
                "/api/v1/no-auth/order",
                "/api/v1/token/refresh",
                "/api/v1/auth/forgot-password/send-mail",
                "/api/v1/auth/reset-password",
                "/api/v1/auth/check-reset-token",
                "/api/v1/user/customer/register"
        );
        String path = request.getServletPath();
        return noAuthEndPoints.contains(path);
    }
}

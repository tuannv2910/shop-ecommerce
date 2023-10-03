package shop.ecommerce.controllers.orders;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.ecommerce.dto.req.order.OrderCheckoutReq;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    public ResponseEntity<Object> checkout(@RequestBody OrderCheckoutReq request) {
        return ResponseEntity.ok().build();
    }
}

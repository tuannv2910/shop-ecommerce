package shop.ecommerce.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.ecommerce.dto.req.order.OrderCheckoutReq;
import shop.ecommerce.services.OrderService;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    @Override
    public Object checkout(OrderCheckoutReq request) {
        System.out.println("ok");
        return null;
    }
}

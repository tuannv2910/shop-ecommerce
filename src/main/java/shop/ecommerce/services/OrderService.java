package shop.ecommerce.services;

import shop.ecommerce.dto.req.order.OrderCheckoutReq;

public interface OrderService {
    Object checkout(OrderCheckoutReq request);
}

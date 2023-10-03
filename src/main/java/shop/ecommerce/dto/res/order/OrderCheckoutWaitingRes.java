package shop.ecommerce.dto.res.order;

import lombok.Builder;
import lombok.Data;
import shop.ecommerce.common.base.rest.ParentResponse;

@Data
@Builder
public class OrderCheckoutWaitingRes extends ParentResponse {
    private String orderCode;
    private String status;

    public OrderCheckoutWaitingRes() {
        super();
    }

    public OrderCheckoutWaitingRes(String orderCode, String status) {
        super();
        this.orderCode = orderCode;
        this.status = status;
    }
}

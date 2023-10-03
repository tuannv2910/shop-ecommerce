package shop.ecommerce.dto.req.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import shop.ecommerce.dto.req.order.customerInfo.CustomerInfoReq;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCheckoutReq {
    private String id;
    private CustomerInfoReq customerInfo;
    private String paymentMethod;
    private String note;
    private String shipPrice;
    private String shopPriceTotal;//tổng tiền hàng
    private String discountPrice ; //số tiền được giảm giá sau khi sử dụng voucher
    private String voucherCode;
    private Long discount;
    private Boolean payed ;
    private Long weight;
    private Long height;
    private Long length;
    private Long width;
}

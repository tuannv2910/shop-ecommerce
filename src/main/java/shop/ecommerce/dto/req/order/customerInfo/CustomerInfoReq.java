package shop.ecommerce.dto.req.order.customerInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerInfoReq {
    private String orderId;
    private String nameOfRecipient;
    private String phoneNumber;
    private String email;
    private String provinceId;
    private String provinceName;
    private String districtId;
    private String districtName;
    private String wardCode;
    private String wardName;
    private String shipServiceId;
    private String shipServiceName;
    private String address;
    private String addressDetail;
}

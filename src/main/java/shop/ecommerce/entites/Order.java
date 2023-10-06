package shop.ecommerce.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "orders")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String to_phone;
    private String to_name;
    private String to_address;
    private String to_ward_code;
    private Integer to_district_id;
    private String return_phone;
    private String return_address;
    private Integer return_district_id;
    private String  return_ward_code;
    private String client_order_code;
    private Long cod_amount;
    private String content;
    private Long weight;
    private Long length;
    private Long width;
    private Long height;
    private Integer pick_station_id; // trạm bưu cục mà shipper nhân.. trường này có vẻ là cần shipper update vào.
    private Long insurance_value; // giá trị bảo hiểm của đơn hàng
    private String coupon;// mã giảm giá... thường là null
    private String  service_type; // khi map sang dto thì sẽ là trường service_type_id service_type_id  = 1 ; // default là
    private Integer service_id;
    private Integer payment_type_id;// lựa chọn người trả phí vận chuyển..  (1 =  admin, 2 = client)
    private String note; // optional
    private String required_note;// enum

}

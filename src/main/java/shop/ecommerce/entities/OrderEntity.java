//package shop.ecommerce.entities;
//
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import java.util.Date;
//
//@Entity
//@Table(name = "orders")
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//public class OrderEntity {
//    @Id
//    private String id;
//    @Column(name = "user_id")
//    private String userId;
//    //Ghi chú
//    private String note;
//    //đã thanh toán chưa
//    @Column(name = "payed ")
//    private Boolean payed;
//    //hình thức thanh toán
//    private String payment;
//    //tiền ship
//    @Column(name = "ship_price")
//    private Long shipPrice;
//    /**
//     * mã đơn hàng: DH0001(dùng seq)
//     */
//    private String code;
//    private String status;
//    /**
//     * tổng giá tiền của sản phẩm
//     */
//    private Long shopTotal;
//    /**
//     * Số tiền được giảm giá
//     */
//    private Long discount;
//    /**
//     * Tiền được giảm giá khi sử dụng voucher
//     */
//    private Long voucherDiscount;
//    /**
//     * tổng tiền
//     */
//    private Long total;
//    private String voucherCode;
//    private String customerInfo;
//    private String phoneNumber;
//    private String email;
//    private Long weight;
//    private Long height;
//    private Long length;
//    private Long width;
//    private String orderType;
//    @CreatedDate
//    @Column(name = "created_date")
//    private Date createdDate;
//    @CreatedBy
//    @Column(name = "created_by")
//    private String createdBy;
//    @LastModifiedDate
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "updated_date")
//    private Date updatedDate;
//    @LastModifiedBy
//    @Column(name = "updated_by")
//    private String updatedBy;
//
//}

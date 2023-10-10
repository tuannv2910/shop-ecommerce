package shop.ecommerce.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.ecommerce.entites.Order;
import shop.ecommerce.repository.OrderRepository;

import static shop.ecommerce.utils.UUIDUtils.generatePhone;
import static shop.ecommerce.utils.UUIDUtils.generateString;
import static shop.ecommerce.utils.UUIDUtils.randomNumber;
import static shop.ecommerce.utils.UUIDUtils.randomPrice;

@Service
public class InsertDataWorker  {
    private int breakRecord = 10000;
    private int totalRecord = 1000000;

    @Autowired
    OrderRepository orderRepository;

    public void run() {
        this.insert();
    }

    public void insert() {
        for (int i = 1; i <= breakRecord; i++) {
            Order order = Order.builder()
                    .id(generateString())
                    .to_phone(generatePhone())
                    .to_name(generateString())
                    .to_ward_code(String.valueOf(Math.random()))
                    .to_address(generateString())
                    .to_ward_code(String.valueOf(randomNumber()))
                    .to_district_id(randomNumber())
                    .return_phone(generateString())
                    .return_address(generateString())
                    .return_district_id(randomNumber())
                    .return_ward_code(generateString())
                    .client_order_code(generateString())
                    .cod_amount((long) randomNumber())
                    .content(generatePhone())
                    .weight((long) randomNumber())
                    .length((long) randomNumber())
                    .width((long) randomNumber())
                    .height((long) randomNumber())
                    .pick_station_id( randomNumber())
                    .insurance_value((long) randomPrice())// trạm bưu cục mà shipper nhân.. trường này có vẻ là cần shipper update vào.insurance_value(generateString() // giá trị bảo hiểm của đơn hàng
                    .coupon(generateString())// mã giảm giá... thường là null
                    .service_type(generateString()) // khi map sang dto thì sẽ là trường service_type_id service_type_id  = 1 (generateString() // default là
                    .service_id(111585)
                    .payment_type_id(111585)// lựa chọn người trả phí vận chuyển..  (1 =  admin, 2 = client)
                    .note(generateString()) // optional
                    .required_note(generateString())
                    .build();
            orderRepository.save(order);
        }
    }
}

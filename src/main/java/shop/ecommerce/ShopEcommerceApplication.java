package shop.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import shop.ecommerce.worker.InsertDataWorker;

@SpringBootApplication
public class ShopEcommerceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopEcommerceApplication.class, args);
    }

}

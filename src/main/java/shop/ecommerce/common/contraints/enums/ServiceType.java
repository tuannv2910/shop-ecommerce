package shop.ecommerce.common.contraints.enums;

import lombok.Getter;

@Getter
public enum ServiceType {
    ECOMMERCE(1,"E-commerce Delivery"),
    TRANSITIONAL(2,"Traditional Delivery");
    private final Integer id;
    private final String name;
    ServiceType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

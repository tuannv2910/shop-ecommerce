package shop.ecommerce.entites;

import javax.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private Integer quantity;
    private Long price;
    private Long length;
    private Long weight;
    private Long width;
    private Long height;
    private Integer categoryId;
}

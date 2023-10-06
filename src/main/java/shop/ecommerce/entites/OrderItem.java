package shop.ecommerce.entites;

import javax.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long order_id;
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

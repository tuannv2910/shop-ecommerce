package shop.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.ecommerce.entites.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

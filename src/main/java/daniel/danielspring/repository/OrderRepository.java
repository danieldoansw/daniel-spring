package daniel.danielspring.repository;

import daniel.danielspring.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}

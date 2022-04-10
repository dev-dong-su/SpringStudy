package taco.data;

import org.springframework.data.repository.CrudRepository;
import taco.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}

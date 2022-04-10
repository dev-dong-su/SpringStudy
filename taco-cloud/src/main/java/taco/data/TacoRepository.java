package taco.data;

import org.springframework.data.repository.CrudRepository;
import taco.domain.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}

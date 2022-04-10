package taco.data;

import org.springframework.data.repository.CrudRepository;
import taco.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}

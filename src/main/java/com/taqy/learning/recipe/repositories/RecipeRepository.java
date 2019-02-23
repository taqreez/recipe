package com.taqy.learning.recipe.repositories;

import com.taqy.learning.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

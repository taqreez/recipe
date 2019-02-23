package com.taqy.learning.recipe.repositories;

import com.taqy.learning.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface Categoryrepository extends CrudRepository<Category, Long> {
}

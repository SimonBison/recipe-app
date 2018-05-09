package com.gmail.spbisoft.recipeapp.repositories;

import com.gmail.spbisoft.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;



public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
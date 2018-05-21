package com.gmail.spbisoft.recipeapp.services;

import com.gmail.spbisoft.recipeapp.commands.RecipeCommand;
import com.gmail.spbisoft.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
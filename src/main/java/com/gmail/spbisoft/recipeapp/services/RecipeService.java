package com.gmail.spbisoft.recipeapp.services;

import com.gmail.spbisoft.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
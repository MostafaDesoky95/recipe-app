package com.mostafa.recipeapp.services;

import com.mostafa.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}

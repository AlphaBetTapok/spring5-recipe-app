package com.taranenkoant.service;

import com.taranenkoant.commands.RecipeCommand;
import com.taranenkoant.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}

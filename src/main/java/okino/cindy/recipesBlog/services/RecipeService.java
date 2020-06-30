package okino.cindy.recipesBlog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import okino.cindy.recipesBlog.entities.Recipe;
import okino.cindy.recipesBlog.repositories.RecipeRepository;

@Service
public class RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;
	
	public Recipe save(Recipe recipe) {
		return recipeRepository.save(recipe);
	}
}

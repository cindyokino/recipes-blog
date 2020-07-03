package okino.cindy.recipesBlog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import okino.cindy.recipesBlog.entities.Recipe;
import okino.cindy.recipesBlog.repositories.RecipeRepository;

@Service
public class RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;
	
	public Recipe insert(Recipe recipe) {
		return recipeRepository.save(recipe);
	}
	
	public List<Recipe> findAll() {
		return recipeRepository.findAll();
	}

	
}

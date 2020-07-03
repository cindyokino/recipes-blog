package okino.cindy.recipesBlog.services;

import java.util.List;
import java.util.Optional;

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

//	public List<Recipe> findByName() {
//		return recipeRepository.findAll();  // SEARCH find by name or part of a name
//	}
	
	public Recipe findById(Long id) {
		Optional<Recipe> obj = recipeRepository.findById(id);
		return obj.orElseThrow(() -> new IllegalArgumentException("ERROR: Object not found at the database"));
	}
	
	public Recipe update(Recipe recipe) {
		if (!(findById(recipe.getId()) == null)) {
			recipeRepository.save(recipe);
		}
		return recipeRepository.save(recipe);
	}
	
	public void deleteById(Long id) {
		if (!(findById(id) == null)) {
			recipeRepository.deleteById(id);
		}
	}
}

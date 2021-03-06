package okino.cindy.recipesBlog.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import okino.cindy.recipesBlog.entities.Category;
import okino.cindy.recipesBlog.entities.Recipe;
import okino.cindy.recipesBlog.services.RecipeService;

@RestController
@RequestMapping(value="/recipes")
public class RecipeController {
	List<Recipe> list = Arrays.asList(new Recipe("Carrot Cake", 190, Category.CAKES, 
			Arrays.asList("2 carrots", "1 cup of water", "1/2 cup of oil", "2 eggs", "1 tablespoon of baking powder", "2 cups of flour", "1 cup of sugar"), 
			"In a large bowl, beat together eggs, oil, white sugar . Mix in flour, baking powder. Stir in carrots. Pour into prepared pan. Bake in the preheated oven for 40 to 50 minutes, or until a toothpick inserted into the center of the cake comes out clean. Let cool in pan for 10 minutes, then turn out onto a wire rack and cool completely."));
	
	@Autowired
	private RecipeService recipeService;
	
	@GetMapping
	public ResponseEntity<List<Recipe>> findRecipes() { // ADD filter by category
		List<Recipe> recipes = recipeService.findAll();
		return ResponseEntity.ok().body(recipes);
 	}
	
	@GetMapping(value = "/{search}") 
	public ResponseEntity<List<Recipe>> findRecipeByName(@RequestParam(value="name", required=false) String name) { // RequestParam é o que está no endereco
		List<Recipe> list = recipeService.findByName(name);
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Recipe> insertRecipe(@RequestBody Recipe recipe) { // Body é o que está no corpo
		recipeService.insert(recipe);
		return ResponseEntity.ok(recipe);
	}
	
	@PutMapping
	public ResponseEntity<Recipe> updateRecipe(@RequestBody Recipe recipe) { 
		Recipe updatedRecipe;
		try {
		updatedRecipe = recipeService.update(recipe);
		} catch(IllegalArgumentException exception) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok().body(updatedRecipe);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteRecipe(@PathVariable Long id) {  // PathVariable é o que está no endereco (ver RequestParam X PathVariable)
		recipeService.deleteById(id);
		return ResponseEntity.noContent().build();
	}	
}

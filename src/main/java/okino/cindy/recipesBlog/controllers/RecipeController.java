package okino.cindy.recipesBlog.controllers;

import java.util.Arrays;
import java.util.List;

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

@RestController
@RequestMapping(value="/recipes")
public class RecipeController {
	List<Recipe> list = Arrays.asList(new Recipe("Carrot Cake", 190, Category.CAKES, Arrays.asList("2 carrots", "1 cup of water", "1/2 cup of oil", "2 eggs", "1 tablespoon of baking powder", "2 cups of flour", "1 cup of sugar"), "In a large bowl, beat together eggs, oil, white sugar . Mix in flour, baking powder. Stir in carrots. Pour into prepared pan.\r\n" + 
			"Bake in the preheated oven for 40 to 50 minutes, or until a toothpick inserted into the center of the cake comes out clean. Let cool in pan for 10 minutes, then turn out onto a wire rack and cool completely."));
	
	@GetMapping
	public ResponseEntity<List<Recipe>> findRecipes(
			@RequestParam(value = "category", defaultValue = "") Category category) {		
		return ResponseEntity.ok().body(list);
 	}
	
	@GetMapping(value = "/{name}")
	public ResponseEntity<List<Recipe>> findRecipeByName() {
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<List<Recipe>> insertRecipe(@RequestBody List<Recipe> recipes) {
		return ResponseEntity.ok(recipes);
	}
	
	@PutMapping
	public ResponseEntity<Recipe> updateRecipe(@RequestBody Recipe recipe) {
		Recipe updatedRecipe = new Recipe("Strawberry shake", 15, Category.DRINKS, Arrays.asList("2 carrots", "1 cup of water", "1/2 cup of oil", "2 eggs", "1 tablespoon of baking powder", "2 cups of flour", "1 cup of sugar"), "Mix everything on the mixer, add ice and enjoy !.");
		return ResponseEntity.ok().body(updatedRecipe);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteRecipe(@PathVariable Long id) {
		return ResponseEntity.noContent().build();
	}
	
}
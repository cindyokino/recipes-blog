package okino.cindy.recipesBlog.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import okino.cindy.recipesBlog.entities.Category;
import okino.cindy.recipesBlog.entities.Recipe;

@RestController
@RequestMapping(value="/recipes")
public class RecipeController {
	List<Recipe> list = Arrays.asList(new Recipe("Carrot Cake", 190, Category.CAKES, Arrays.asList("2 carrots", "1 cup of water", "1/2 cup of oil", "2 eggs", "1 tablespoon of baking powder", "2 cups of flour", "1 cup of sugar"), "In a large bowl, beat together eggs, oil, white sugar . Mix in flour, baking powder. Stir in carrots. Pour into prepared pan.\r\n" + 
			"Bake in the preheated oven for 40 to 50 minutes, or until a toothpick inserted into the center of the cake comes out clean. Let cool in pan for 10 minutes, then turn out onto a wire rack and cool completely."));
	
	@GetMapping
	public ResponseEntity<List<Recipe>> findRecipes() {
		return ResponseEntity.ok().body(list);
 	}
	

}

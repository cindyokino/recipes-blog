package okino.cindy.recipesBlog.entities;

import java.util.List;
import java.util.Locale.Category;

public class Recipe {
	
	private Long id;
	private String name;
	private Integer time;
	private Category category;
	private List<String> ingredients;
	private String instructions;
}

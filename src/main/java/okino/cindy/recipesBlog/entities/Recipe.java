package okino.cindy.recipesBlog.entities;

import java.util.List;
import java.util.Locale.Category;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
//@Getter
//@Setter
//@EqualsAndHashCode
@Data
public class Recipe {
	
	@Setter(AccessLevel.NONE)
	private Long id;
	private String name;
	private Integer time;
	private Category category;
	private List<String> ingredients;
	private String instructions;
	
	public Recipe() {		
	}
	
	public Recipe(String name, Integer time, Category category, List<String> ingredients, String instructions) {
		this.name = name;
		this.time = time;
		this.category = category;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}
}

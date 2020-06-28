package okino.cindy.recipesBlog.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table
@Data //Lombok anotations: @Getter, @Setter and @EqualsAndHashCode OR @Data
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

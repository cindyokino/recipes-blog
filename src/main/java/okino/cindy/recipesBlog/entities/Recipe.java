package okino.cindy.recipesBlog.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table
@Data //Lombok anotations: @Getter, @Setter and @EqualsAndHashCode OR @Data
public class Recipe {
	
	@Setter(AccessLevel.NONE)
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Integer duration;
	private Category category;
	
	@ElementCollection
	private List<String> ingredients;
	private String instructions;
	
	public Recipe() {		
	}
	
	public Recipe(String name, Integer time, Category category, 
			List<String> ingredients, 
			String instructions) {
		this.name = name;
		this.duration = time;
		this.category = category;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}
}

package okino.cindy.recipesBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import okino.cindy.recipesBlog.entities.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}

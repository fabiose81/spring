package br.com.fabiose.receitas.interfaces;

/**
 * Created by fabioestrela on 17/10/16.
 */

import br.com.fabiose.receitas.model.RecipeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends CrudRepository<RecipeModel, Long>{

    @Override
    RecipeModel save(RecipeModel recipeModel);

    @Override
    void delete(RecipeModel recipeModel);

    @Override
    List<RecipeModel> findAll();

}

package br.com.fabiose.receitas.services;

import br.com.fabiose.receitas.interfaces.RecipeRepository;
import br.com.fabiose.receitas.model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fabioestrela on 18/10/16.
 */

@Service
public class RecipeService {


    @Autowired
    private RecipeRepository recipeRepository;

    public RecipeModel save(RecipeModel recipeModel){
        return recipeRepository.save(recipeModel);
    }

    public void delete(RecipeModel recipeModel){
        recipeRepository.delete(recipeModel);
    }

    public List<RecipeModel> findAll(){
        return recipeRepository.findAll();
    }
}

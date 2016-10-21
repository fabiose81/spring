package br.com.fabiose.receitas.controllers;

/**
 * Created by fabioestrela on 17/10/16.
 */

import br.com.fabiose.receitas.model.RecipeModel;
import br.com.fabiose.receitas.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @CrossOrigin
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity findAll(){
        try{
            return ResponseEntity.ok(this.recipeService.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity save(@RequestBody RecipeModel recipeModel){
        try{
            recipeModel = recipeService.save(recipeModel);
            return ResponseEntity.ok(recipeModel);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@RequestBody RecipeModel recipeModel){
        try{
            recipeService.delete(recipeModel);
            return ResponseEntity.ok(recipeModel);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}

package br.com.fabiose.receitas.model;


import javax.persistence.*;

/**
 * Created by fabioestrela on 17/10/16.
 */

@Entity
@Table(name = "recipe")
public class RecipeModel {

    @Id
    @SequenceGenerator(name = "seq_recipe", sequenceName = "recipe_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_recipe")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "ingredients")
    private String ingredients;

    @Column(name = "directions")
    private String directions;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }
}

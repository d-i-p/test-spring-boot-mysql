package com.example.test.controller;

import com.example.test.models.Ingredient;
import com.example.test.repository.IngredientsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO logging
//TODO exception management
//TODO add tests
//TODO Dockerization

@RestController("/")
public class IngredientController {

    @Autowired
    private IngredientsRepository ingredientsRepository;

    public IngredientController(IngredientsRepository ingredientsRepository) {
        this.ingredientsRepository = ingredientsRepository;
    }

    @GetMapping("ingredients")
    public List<Ingredient> index() {

        return ingredientsRepository.findAll();
    }

    @GetMapping("/ingredient")
    public Ingredient singleParam(@RequestParam String name) {

        return ingredientsRepository.findByName(name);
    }

    @PostMapping("/addIngredient")
    Ingredient newIngredient(@RequestBody Ingredient newIngredient) {
        return ingredientsRepository.save(newIngredient);
    }

    @DeleteMapping("/ingredients/{id}")
    void deleteIngredient(@PathVariable Long id) {
        ingredientsRepository.deleteById(id);
    }

}

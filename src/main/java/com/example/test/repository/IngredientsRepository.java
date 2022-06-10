package com.example.test.repository;

import com.example.test.models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientsRepository extends CrudRepository<Ingredient, Long> {
    @Override
    List<Ingredient> findAll();

    Ingredient findByName(String name);
}

package com.example.test.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ingredients")
public class Ingredient extends BaseModel {

    private String name;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

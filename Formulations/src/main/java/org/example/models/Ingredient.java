package org.example.models;

import java.util.List;

public class Ingredient {

    private int id;
    private String description;
    private Unit unit;
    private double cost;

    private List<Composition> compositions;

    public Ingredient(int id, String description, int idUnit) {
        this.id = id;
        this.description = description;
    }





}

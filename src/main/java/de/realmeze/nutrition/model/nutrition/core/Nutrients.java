package de.realmeze.nutrition.model.nutrition.core;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Nutrients {
    //Nutrient values per 100g of food
    private Double calories;
    private double protein;
    private double fat;
    private double carbs;
}

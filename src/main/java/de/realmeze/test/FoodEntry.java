package de.realmeze.test;

import de.realmeze.nutrition.model.nutrition.core.FoodProduct;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FoodEntry {

    private String name;
    private FoodProduct food;
    private double totalWeight;
    private double totalCalories;

}

package de.realmeze.nutrition.service;

import de.realmeze.test.FoodEntry;
import de.realmeze.nutrition.model.nutrition.core.FoodProduct;

public class FoodService {

    /**
     *
     * @param product to make entry from
     * @param weight in grams
     * @return
     */
    public FoodEntry makeEntry(FoodProduct product, double weight) {
        FoodEntry entry = FoodEntry.builder().food(product).name(product.getName() + weight + "g").totalCalories(product.getNutrients().getCalories() * weight/100).totalWeight(weight).build();
        return entry;
    }

}

package de.realmeze.test;

import de.realmeze.test.FoodEntry;
import de.realmeze.nutrition.model.nutrition.core.FoodProduct;
import de.realmeze.nutrition.model.nutrition.core.Nutrients;
import de.realmeze.nutrition.service.CaloryService;
import de.realmeze.nutrition.service.FoodService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static CaloryService caloryService = new CaloryService();
    private static FoodService foodService = new FoodService();

    public static List<FoodProduct> setup() {
        FoodProduct apple = FoodProduct.builder().nutrients(Nutrients.builder().carbs(1).fat(1).protein(1).build()).name("Apple").build();
        apple.getNutrients().setCalories(caloryService.calculateCaloriesFromNutrients(apple.getNutrients()));
        return new ArrayList<>(){{
            add(apple);
        }};
    }

    public static void main(String[] args) {
        List<FoodProduct> products = setup();
        FoodProduct apple = products.get(0);
        FoodEntry test = foodService.makeEntry(apple, 101.1);
        System.out.println(test.toString());
    }

}

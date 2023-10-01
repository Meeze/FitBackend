package de.realmeze.nutrition.service;

import de.realmeze.nutrition.model.nutrition.core.Nutrients;

import java.util.Objects;

public class CaloryService {

    public static int CALORIES_FAT = 9;
    public static int CALORIES_CARBS = 4;
    public static int CALORIES_PROTEIN = 4;

    public double calculateCaloriesFromNutrients(Nutrients nutrients) {
        return Objects.isNull(nutrients.getCalories()) ?
                nutrients.getFat() * CALORIES_FAT + nutrients.getCarbs() * CALORIES_CARBS + nutrients.getProtein() * CALORIES_PROTEIN :
                nutrients.getCalories();
    }

}

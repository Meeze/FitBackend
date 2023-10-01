package de.realmeze.nutrition.model.nutrition.core;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FoodProduct {

    private String name;
    private Nutrients nutrients;

}

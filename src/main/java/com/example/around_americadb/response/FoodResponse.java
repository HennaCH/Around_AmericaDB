package com.example.around_americadb.response;

import com.example.around_americadb.entity.Food;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodResponse {

    private String foodName;

    private String description;

    public FoodResponse(Food food){
        foodName = food.getFood();
        description = food.getDescription();
    }
}

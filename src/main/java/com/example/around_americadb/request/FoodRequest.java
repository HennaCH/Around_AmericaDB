package com.example.around_americadb.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodRequest {
    @NotBlank
    private String foodName;

    @NotBlank
    private String description;
}

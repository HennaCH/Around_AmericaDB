package com.example.around_americadb.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryRequest {
    @NotBlank
    private String countryName;
    @NotBlank
    private String capital;

    @NotNull
    @Valid
    private FoodRequest foodRequest;
}

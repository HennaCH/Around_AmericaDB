package com.example.around_americadb.response;

import com.example.around_americadb.entity.Attraction;
import com.example.around_americadb.entity.Country;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CountryResponse {
    private long id;
    private String countryName;
    private String capital;
    private List<Attraction> attractionName;

    private FoodResponse food;
    public CountryResponse(Country country){
        id = country.getId();
        countryName = country.getCountryName();
        capital = country.getCapital();
        attractionName = country.getAttractions();
        food = new FoodResponse(country.getFood());
    }
}

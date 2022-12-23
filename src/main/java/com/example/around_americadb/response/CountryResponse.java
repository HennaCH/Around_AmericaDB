package com.example.around_americadb.response;

import com.example.around_americadb.entity.Country;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryResponse {
    private long id;
    private String countryName;
    private String capital;
    private String attractionName;
    private String food;

    public CountryResponse(Country country){
        id = country.getId();
        countryName = country.getCountryName();
        capital = country.getCapital();
        attractionName = country.getAttraction();
        food = country.getFood();
    }
}

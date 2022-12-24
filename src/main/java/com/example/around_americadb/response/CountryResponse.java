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
    //private String attractionName;
    private List<Attraction> attractionName;

    private String food;

    //private AttractionResponse attraction;
    public CountryResponse(Country country){
        id = country.getId();
        countryName = country.getCountryName();
        capital = country.getCapital();
        attractionName = country.getAttractions();
        //attraction = new AttractionResponse(country.getAttractions());
        //food = country.getFood;
    }
}

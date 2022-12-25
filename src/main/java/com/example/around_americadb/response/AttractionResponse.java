package com.example.around_americadb.response;

import com.example.around_americadb.entity.Attraction;
import com.example.around_americadb.entity.Country;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttractionResponse {

    private long id;

    private String attractionName;

    private String description;

    private CountryResponse country;

    public AttractionResponse(Attraction attraction){
        id = attraction.getId();
        attractionName = attraction.getAttractionName();
        description =  attraction.getDescription();
        country = new CountryResponse(attraction.getCountry());

    }
}

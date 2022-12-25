package com.example.around_americadb.controller;


import com.example.around_americadb.entity.*;
import com.example.around_americadb.request.*;
import com.example.around_americadb.response.*;
import com.example.around_americadb.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/countries")
public class CountryController {
    @Autowired
    CountryService countryService;
    @Autowired
    AttractionService attractionService;

    @GetMapping()
    public List<CountryResponse> getAllCountries(){

         List<Country> countries = countryService.getAllCountries();

         List<CountryResponse> countryResponses = new ArrayList<>();
         countries.forEach(country -> {
             countryResponses.add(new CountryResponse(country));
         });
         return countryResponses;
    }

    @PostMapping()
    public CountryResponse addCountry(@Valid @RequestBody CountryRequest countryRequest){
        Country country = countryService.insertCountry(countryRequest);
        return new CountryResponse(country);
    }

    @PostMapping("/{id}/attractions")
    public  AttractionResponse addAttraction(
            @PathVariable long countryId,
            @Valid @RequestBody AttractionRequest attractionRequest)
    {

        return new AttractionResponse(
                countryService.addAttractionToCountry(countryId,attractionRequest));
    }


    /*@GetMapping
    public List<AttractionResponse> getAllAttractions(@PathVariable long id){
        List<Attraction> attractions = countryService.getAllAttractions(id);
        List<AttractionResponse> attractionResponses = new ArrayList<>();
        for (int i=0; i < attractions.size(); i++){
            attractionResponses.add(new AttractionResponse(attractions.get(i)));
        }
        return attractionResponses;
    }*/


    /*@GetMapping("/{id}")
    public CountryResponse getCountry(long id){
        Country country = countryService.getCountry(id);

        CountryResponse countryResponse = new CountryResponse(country);

        return countryResponse;
    }*/

   // @DeleteMapping("/{id}/attractions")
    //public void deleteAllAttractions(@PathVariable long id){
        //countryService.deleteAllAttractions(id);
    //}



    }

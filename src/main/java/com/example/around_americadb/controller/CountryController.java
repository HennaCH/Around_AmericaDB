package com.example.around_americadb.controller;


import com.example.around_americadb.entity.*;
import com.example.around_americadb.request.*;
import com.example.around_americadb.response.*;
import com.example.around_americadb.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
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



    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public AttractionResponse insertAttraction(@Valid @RequestBody AttractionRequest attractionRequest) {

        Attraction attraction = attractionService.insertAttraction(attractionRequest);
        return new AttractionResponse(attraction);


        }

    }

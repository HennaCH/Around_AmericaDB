package com.example.around_americadb.controller;


import com.example.around_americadb.entity.Country;
import com.example.around_americadb.response.CountryResponse;
import com.example.around_americadb.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/countries/")
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping()
    public List<CountryResponse> getAllCountries(){

         List<Country> countries = countryService.getAllCountries();

         List<CountryResponse> countryResponse = new ArrayList<>();
         countries.forEach(country -> {
             countryResponse.add(new CountryResponse(country));
         });
         return countryResponse;
    }
}

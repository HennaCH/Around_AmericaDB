package com.example.around_americadb.service;


import com.example.around_americadb.entity.Attraction;
import com.example.around_americadb.entity.Country;
import com.example.around_americadb.repository.AttractionRepository;
import com.example.around_americadb.repository.CountryRepository;
import com.example.around_americadb.request.AttractionRequest;
import com.example.around_americadb.request.CountryRequest;
import org.hibernate.AnnotationException;
import org.hibernate.annotations.NotFound;
import com.example.around_americadb.service.CountryService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    AttractionRepository attractionRepository;
    //public Country getCountry(long id){
      //  return countryRepository.findByCountryId(id);
    //}

    public List<Country> getAllCountries() {

        return (List<Country>) countryRepository.findAll();
    }

    public Country insertCountry(CountryRequest countryRequest){
        return countryRepository.save(new Country(countryRequest));
    }

    public Attraction addAttractionToCountry(long countryId, AttractionRequest attractionRequest) {
        Country country = countryRepository.findById(countryId)
                .orElseThrow();
        Attraction attraction = new Attraction(attractionRequest);
        attraction.setCountry(country);
        return attractionRepository.save(attraction);
    }

    //public List<Attraction> getAllAttractions(long id){
      //  return (List<Attraction>) attractionRepository.findAllByCountryId(id);
    //}

    //public void deleteAllAttractions(long countryId){
      //  if(countryRepository.existsById(countryId)){
        //    attractionRepository.deleteAllByCountryId(countryId);
        //}
        //else{
        //}
    //}

}

package com.example.around_americadb.service;


import com.example.around_americadb.entity.Country;
import com.example.around_americadb.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return (List<Country>) countryRepository.findAll();
    }
}

package com.example.around_americadb.service;

import com.example.around_americadb.entity.Attraction;
import com.example.around_americadb.repository.AttractionRepository;
import com.example.around_americadb.request.AttractionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttractionService {
    @Autowired
    AttractionRepository attractionRepository;

    public List<Attraction> getAllAttractions(){
        return (List<Attraction>) attractionRepository.findAll();
    }

    public Attraction insertAttraction(AttractionRequest attractionRequest){

        Attraction attraction = new Attraction(attractionRequest);
        return attractionRepository.save(attraction);
    }

}

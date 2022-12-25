package com.example.around_americadb.service;

import com.example.around_americadb.entity.Attraction;
import com.example.around_americadb.repository.AttractionRepository;
import com.example.around_americadb.request.AttractionRequest;
import com.example.around_americadb.response.AttractionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttractionService {
    @Autowired
   private AttractionRepository attractionRepository;

}

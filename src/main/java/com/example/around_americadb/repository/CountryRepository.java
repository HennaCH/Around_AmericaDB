package com.example.around_americadb.repository;


import com.example.around_americadb.entity.Attraction;
import com.example.around_americadb.entity.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
}

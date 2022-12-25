package com.example.around_americadb.repository;

import com.example.around_americadb.entity.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction,Long> {
    List<Attraction> findByCountryId(long country_id);
    void deleteAllByCountryId(long country_id);
}

package com.example.around_americadb.entity;

import com.example.around_americadb.request.CountryRequest;
import com.example.around_americadb.response.AttractionResponse;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "countries")
@NoArgsConstructor
@Getter
@Setter
public class Country {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "capital")
    private String capital;

   @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Attraction> attractions;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private Food food;

    public Country (CountryRequest countryRequest){
        countryName = countryRequest.getCountryName();
        capital = countryRequest.getCapital();
    }
}

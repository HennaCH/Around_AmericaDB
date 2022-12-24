package com.example.around_americadb.entity;

import com.example.around_americadb.response.AttractionResponse;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "countries")
@Getter
@Setter
public class Country {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "capital")
    private String capital;
    @Column(name = "attraction")
    private String attraction;
    @Column(name = "food")
    private String food;

    @OneToMany()
    private List<Attraction> attractions;

    /*@OneToMany(mappedBy = "country")
    private List<Food> foods;
*/
}

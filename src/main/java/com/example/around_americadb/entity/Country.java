package com.example.around_americadb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


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
    @Column(name = "attraction_name")
    private String attraction;
    @Column(name = "food")
    private String food;

}

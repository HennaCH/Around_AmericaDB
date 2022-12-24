package com.example.around_americadb.entity;

import com.example.around_americadb.request.AttractionRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "attractions")
@Getter
@Setter
@NoArgsConstructor
public class Attraction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "attraction_name")
    private String attractionName;

    @Column(name="description")
    private String description;

    //@ManyToOne(cascade = CascadeType.PERSIST)
    //@JoinColumn(name = "fk_country_id", nullable = false )
    //private Country country;

    public Attraction(AttractionRequest attractionRequest){
        attractionName = attractionRequest.getAttractionName();
        description = attractionRequest.getDescription();
    }

}

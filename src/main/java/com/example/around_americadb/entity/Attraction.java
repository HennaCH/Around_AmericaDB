package com.example.around_americadb.entity;

import com.example.around_americadb.request.AttractionRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "attractions")
@Getter
@Setter
@NoArgsConstructor
public class Attraction {
    @Id @GeneratedValue
    private long id;

    private String attractionName;

    private String description;


    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="country_id")
    private Country country;

    public Attraction(AttractionRequest attractionRequest){
        attractionName = attractionRequest.getAttractionName();
        description = attractionRequest.getDescription();

    }

}

package com.example.around_americadb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "foods")
@Getter
@Setter
public class Food {
    @Id
    private long id;

    @Column(name = "food")
    private String food;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_country_id", nullable = false )
    private Country country;
}

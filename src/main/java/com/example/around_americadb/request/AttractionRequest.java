package com.example.around_americadb.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttractionRequest {
    @NotBlank
    private String attractionName;

    @NotBlank
    private String description;
}

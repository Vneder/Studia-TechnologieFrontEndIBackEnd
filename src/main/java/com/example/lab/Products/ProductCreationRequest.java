package com.example.lab.Products;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public final class ProductCreationRequest {

    @NotNull
    private final String duration;

    @NotNull
    private final String name;

    @NotNull
    private final String release_date;

    @NotNull
    private final String studio;

    @NotNull
    @Positive
    private final Long categoryId;

    @JsonCreator
    public ProductCreationRequest(
            @JsonProperty("duration") String duration,
            @JsonProperty("name") String name,
            @JsonProperty("release_date") String release_date,
            @JsonProperty("studio") String studio,
            @JsonProperty("categoryId") Long categoryId) {
        this.duration = duration;
        this.name = name;
        this.release_date = release_date;
        this.studio = studio;
        this.categoryId = categoryId;
    }
}

package com.stupnikjs.quizzspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;


    @Embeddable
    public class Items {

        @JsonProperty("A")
        private String A;

        @JsonProperty("B")
        private String B;

        @JsonProperty("C")
        private String C;

        @JsonProperty("D")
        private String D;

        // Getters and Setters
    }


package com.example.mongo.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
public class ChildFirst extends Parent{
    private String name;

    public ChildFirst(Long id, String name) {
        super(id);
        this.name = name;
    }
}

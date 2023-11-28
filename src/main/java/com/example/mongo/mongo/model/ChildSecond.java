package com.example.mongo.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChildSecond extends Parent{
    private String famlyName;
    private Integer justInt;
    private Boolean justBool;
    private List<String> str;

    public ChildSecond(Long id, String famlyName, Integer justInt, Boolean justBool, List<String> str) {
        super(id);
        this.famlyName = famlyName;
        this.justInt = justInt;
        this.justBool = justBool;
        this.str = str;
    }
}

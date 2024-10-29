package com.iftm.startexample.start.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user")
@Data 
public class User {

    @Id
    private ObjectId id;

    @Field("name")
    private String name;

    private int age;
    
    private Address address;

    // Construtor padrão
    public User() {
    }

    // Construtor com parâmetros
    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

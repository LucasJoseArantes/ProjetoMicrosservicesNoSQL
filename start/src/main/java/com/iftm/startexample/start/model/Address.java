package com.iftm.startexample.start.model;

import lombok.Data;

@Data
public class Address {

    private String street;
    private int number;
    
    public Address() {
    }   

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }   
}

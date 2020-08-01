package com.company.devices;

public class Car {
    final String model;
    final String producer;
    final int year;


    public Car(String model, String producer, int year) {
        this.model = model;
        this.producer = producer;
        this.year = year;
    }

    public String toString(){
        return "Car Model: "+model+" Car Producer: "+producer+" Car year: "+year;
    }
}

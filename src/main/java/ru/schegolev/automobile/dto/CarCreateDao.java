package ru.schegolev.automobile.dto;

import lombok.Data;
import ru.schegolev.automobile.models.Car;

@Data
public class CarCreateDao {
    private String manufacturer;
    private  String model;
    private double engineCapacity;
    private int age;
    private  String color;
    private String type;
}

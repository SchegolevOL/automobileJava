package ru.schegolev.automobile.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Cars")
public class Car {
    public enum Type{
        Sedan, Hatchback, StationWagon
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String manufacturer;
    private  String model;
    private double engineCapacity;
    private int age;
    private  String color;
    //@Enumerated(value = EnumType.STRING)
    private String type;

}
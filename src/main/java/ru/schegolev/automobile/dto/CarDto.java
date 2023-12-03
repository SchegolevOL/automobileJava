package ru.schegolev.automobile.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class CarDto {
    @NotEmpty
    @Length(min = 3, max=10)
    private String manufacturer;
    @NotEmpty
    @Length(min = 3, max=10)
    private String model;
}


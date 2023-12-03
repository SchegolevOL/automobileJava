package ru.schegolev.automobile.services;

import ru.schegolev.automobile.dto.CarCreateDao;
import ru.schegolev.automobile.dto.CarDto;

public interface CarService {
    void addCar(CarDto carDto);
    public void createCar(CarCreateDao carCreateDao);
}

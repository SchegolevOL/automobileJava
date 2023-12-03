package ru.schegolev.automobile.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.schegolev.automobile.dto.CarCreateDao;
import ru.schegolev.automobile.dto.CarDto;
import ru.schegolev.automobile.models.Car;
import ru.schegolev.automobile.repositury.CarRepository;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    public void addCar(CarDto carDto) {
        Car carBuilder = Car.builder()
                .manufacturer(carDto.getManufacturer())
                .model(carDto.getModel())
                .build();
        carRepository.save(carBuilder);
    }

    @Override
    public void createCar(CarCreateDao carCreateDao) {
        Car builderCar = Car.builder()
                .manufacturer(carCreateDao.getManufacturer())
                .model(carCreateDao.getModel())
                .age(carCreateDao.getAge())
                .color(carCreateDao.getColor())
                .engineCapacity(carCreateDao.getEngineCapacity())
                .type(carCreateDao.getType()).build();
        carRepository.save(builderCar);
    }
}

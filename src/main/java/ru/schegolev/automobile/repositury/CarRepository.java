package ru.schegolev.automobile.repositury;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.schegolev.automobile.models.Car;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByModel(String model);

}

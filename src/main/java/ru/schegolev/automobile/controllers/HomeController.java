package ru.schegolev.automobile.controllers;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.schegolev.automobile.dto.CarCreateDao;
import ru.schegolev.automobile.dto.CarDto;
import ru.schegolev.automobile.models.Car;
import ru.schegolev.automobile.services.CarService;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class HomeController {
    private final CarService carService;
    @GetMapping("/")
    public String gethomePage(){

        return "/home";
    }

    @GetMapping("/create")
    public String getCreatePage(Model model){

        model.addAttribute("type");
        return "/create";
    }
    @PostMapping("/create")
    public String createCar(CarCreateDao carCreateDao){
        carService.createCar(carCreateDao);
        return "redirect:/home";
    }
}

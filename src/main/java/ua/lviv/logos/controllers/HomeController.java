package ua.lviv.logos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.logos.entity.Car;
import ua.lviv.logos.service.CarService;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Controller
public class HomeController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/showAllCars", method = RequestMethod.GET)
    public String showAllCars(Model model){
        List<Car> carList = carService.findAll();
        model.addAttribute("cars", carList);
        return "allCars";
    }
}

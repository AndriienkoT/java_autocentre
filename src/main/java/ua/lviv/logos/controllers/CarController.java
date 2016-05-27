package ua.lviv.logos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.logos.service.CarService;

/**
 * Created by user on 27/05/2016.
 */
@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/newCar", method = RequestMethod.GET)
    public String newCar(Model model){
        return "newCar";
    }

    @RequestMapping(value = "/createNewCar", method = RequestMethod.POST)
    public String createNewCar(@RequestParam(value = "model") String model, @RequestParam(value = "equipment") String equipment, @RequestParam(value = "engine_volume") double engine_volume, @RequestParam(value = "engine_type") String engine_type, @RequestParam(value = "year_of_issue") int year_of_issue, @RequestParam(value = "mileage") double mileage, @RequestParam(value = "price") double price){
        carService.add(model, equipment, engine_volume, engine_type, year_of_issue, mileage, price);
        return "redirect:/showAllCars";
    }
}

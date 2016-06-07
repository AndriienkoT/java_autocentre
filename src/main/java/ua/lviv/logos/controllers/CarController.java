package ua.lviv.logos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.logos.entity.Car;
import ua.lviv.logos.service.CarService;

import java.util.List;

/**
 * Created by user on 27/05/2016.
 */
@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/car-range", method = RequestMethod.GET)
    public String carRange(){
        return "car-range";
    }

    @RequestMapping(value = "/showAllCars", method = RequestMethod.GET)
    public String showAllCars(Model model){
        List<Car> carList = carService.findAll();
        model.addAttribute("cars", carList);
        return "car-all";
    }

    @RequestMapping(value = "/newCar", method = RequestMethod.GET)
    public String newCar(Model model){
        return "car-new";
    }

    @RequestMapping(value = "/createNewCar", method = RequestMethod.POST)
    public String createNewCar(@RequestParam(value = "model") String model, @RequestParam(value = "equipment") String equipment, @RequestParam(value = "engine_volume") double engine_volume, @RequestParam(value = "engine_type") String engine_type, @RequestParam(value = "year_of_issue") int year_of_issue, @RequestParam(value = "mileage") double mileage, @RequestParam(value = "price") double price){
        carService.add(model, equipment, engine_volume, engine_type, year_of_issue, mileage, price);
        return "redirect:/showAllCars";
    }

    @RequestMapping(value = "/findByModel", method = RequestMethod.GET)
    public String findByModel(Model model){
        return "car-findByModel";
    }

    @RequestMapping(value = "/findCarByModel", method = RequestMethod.POST)
    public String findCarByModel(Model model, @RequestParam(value = "model") String model1){
        List<Car> carList = carService.findByModel(model1);
        model.addAttribute("cars", carList);
        return "car-findByModel";
    }

    @RequestMapping(value = "/findByEngineVolume", method = RequestMethod.GET)
    public String findByEngineVolume(Model model){
        return "car-findByEngineVolume";
    }

    @RequestMapping(value = "/findCarByEngineVolume", method = RequestMethod.POST)
    public String findCarByEngineVolume(Model model, @RequestParam(value = "engine_volume") double engine_volume){
        List<Car> carList = carService.findByEngineVolume(engine_volume);
        model.addAttribute("cars", carList);
        return "car-findByEngineVolume";
    }

    @RequestMapping(value = "/findByYearOfIssue", method = RequestMethod.GET)
    public String findByYearOfIssue(Model model){
        return "car-findByYearOfIssue";
    }

    @RequestMapping(value = "/findCarByYearOfIssue", method = RequestMethod.POST)
    public String findCarByYearOfIssue(Model model, @RequestParam(value = "year_of_issue") int year_of_issue){
        List<Car> carList = carService.findByYearOfIssue(year_of_issue);
        model.addAttribute("cars", carList);
        return "car-findByYearOfIssue";
    }

    @RequestMapping(value = "/deleteCar", method = RequestMethod.GET)
    public String deleteCar(Model model){
        return "car-delete";
    }

    @RequestMapping(value = "/deleteCarById", method = RequestMethod.POST)
    public String deleteCarById(@RequestParam(value = "id") int id){
        carService.delete(id);
        return "redirect:/showAllCars";
    }

}
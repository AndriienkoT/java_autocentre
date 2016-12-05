package ua.lviv.logos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.logos.entity.PartsAndAccessories;
import ua.lviv.logos.service.PartsAndAccessoriesService;

import java.util.List;

/**
 * Created by user on 07/06/2016.
 */
@Controller
public class PartsAndAccessoriesController {

    @Autowired
    private PartsAndAccessoriesService partsAndAccessoriesService;

    @RequestMapping(value = "/showAllPartsAndAccessories", method = RequestMethod.GET)
    public String showAllPartsAndAccessories(Model model){
        List<PartsAndAccessories> partsAndAccessoriesList = partsAndAccessoriesService.findAll();
        model.addAttribute("partsAndAccessoriess", partsAndAccessoriesList);
        return "partsAndAccessories-all";
    }

    @RequestMapping(value = "/newPartsAndAccessories", method = RequestMethod.GET)
    public String newPartsAndAccessories(Model model){
        return "partsAndAccessories-new";
    }

    @RequestMapping(value = "/createNewPartsAndAccessories", method = RequestMethod.POST)
    public String createNewPartsAndAccessories(@RequestParam(value = "name") String name, @RequestParam(value = "amount") int amount, @RequestParam(value = "price") double price){
        partsAndAccessoriesService.add(name, amount, price);
        return "redirect:/showAllPartsAndAccessories";
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public String findByName(Model model){
        return "partsAndAccessories-findByName";
    }

    @RequestMapping(value = "/findPartsByName", method = RequestMethod.POST)
    public String findPartsByName(Model model, @RequestParam(value = "name") String name){
        List<PartsAndAccessories> partsAndAccessoriesList = partsAndAccessoriesService.findByName(name);
        model.addAttribute("partsAndAccessoriess", partsAndAccessoriesList);
        return "partsAndAccessories-findByName";
    }

    @RequestMapping(value = "/deletePartsAndAccessories", method = RequestMethod.GET)
    public String deleteCar(Model model){
        return "partsAndAccessories-delete";
    }

    @RequestMapping(value = "/deletePartsById", method = RequestMethod.POST)
    public String deletePartsById(@RequestParam(value = "id") int id){
        partsAndAccessoriesService.delete(id);
        return "redirect:/showAllPartsAndAccessories";
    }
}

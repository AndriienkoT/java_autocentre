package ua.lviv.logos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.logos.entity.Financing;
import ua.lviv.logos.service.FinancingService;

import java.util.List;

/**
 * Created by user on 05/06/2016.
 */
@Controller
public class FinancingController {

    @Autowired
    private FinancingService financingService;

    @RequestMapping(value = "/financing-main", method = RequestMethod.GET)
    public String financingMain(){
        return "financing-main";
    }

    @RequestMapping(value = "/showAllFinancingTypes", method = RequestMethod.GET)
    public String showAllFinancingTypes(Model model){
        List<Financing> financingList = financingService.findAll();
        model.addAttribute("financings", financingList);
        return "financing-all";
    }

    @RequestMapping(value = "/findByType", method = RequestMethod.GET)
    public String findByType(Model model){
        return "financing-findByType";
    }

    @RequestMapping(value = "/findFinancingByType", method = RequestMethod.POST)
    public String findFinancingByType(Model model, @RequestParam(value = "type") String type){
        List<Financing> financingList = financingService.findByType(type);
        model.addAttribute("financings", financingList);
        return "financing-findByType";
    }
}

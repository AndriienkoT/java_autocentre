package ua.lviv.logos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.logos.entity.TechSupport;
import ua.lviv.logos.service.TechSupportService;

import java.util.List;

/**
 * Created by user on 07/06/2016.
 */
@Controller
public class TechSupportController {

    @Autowired
    private TechSupportService techSupportService;

    @RequestMapping(value = "/techSupport-main", method = RequestMethod.GET)
    public String techSupportMain(){
        return "techSupport-main";
    }

    @RequestMapping(value = "/showAllTechSupport", method = RequestMethod.GET)
    public String showAlltechSupport(Model model){
        List<TechSupport> techSupportList = techSupportService.findAll();
        model.addAttribute("techSupports", techSupportList);
        return "techSupport-all";
    }

    @RequestMapping(value = "/newTechSupport", method = RequestMethod.GET)
    public String newtechSupport(Model model){
        return "techSupport-new";
    }

    @RequestMapping(value = "/createNewTechSupport", method = RequestMethod.POST)
    public String createNewtechSupport(@RequestParam(value = "support_type") String support_type, @RequestParam(value = "price") double price){
        techSupportService.add(support_type, price);
        return "redirect:/showAllTechSupport";
    }

    @RequestMapping(value = "/findBySupportType", method = RequestMethod.GET)
    public String findBySupportType(Model model){
        return "techSupport-findBySupportType";
    }

    @RequestMapping(value = "/findSupportByType", method = RequestMethod.POST)
    public String findSupportByType(Model model, @RequestParam(value = "support_type") String support_type){
        List<TechSupport> techSupportList = techSupportService.findBySupportType(support_type);
        model.addAttribute("techSupports", techSupportList);
        return "techSupport-findBySupportType";
    }

    @RequestMapping(value = "/deleteTechSupport", method = RequestMethod.GET)
    public String deleteTechSupport(Model model){
        return "techSupport-delete";
    }

    @RequestMapping(value = "/deleteSupportById", method = RequestMethod.POST)
    public String deleteSupportById(@RequestParam(value = "id") int id){
        techSupportService.delete(id);
        return "redirect:/showAllTechSupport";
    }
}

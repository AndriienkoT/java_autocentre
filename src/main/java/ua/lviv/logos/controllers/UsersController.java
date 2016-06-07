package ua.lviv.logos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.logos.entity.Users;
import ua.lviv.logos.service.UsersService;


@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    private String newUser(Model model){
        model.addAttribute("user", new Users());
        return "registration";
    }

    @RequestMapping(value = "/createNewUser", method = RequestMethod.POST)
    private String createNewUser(@ModelAttribute Users users){
        usersService.add(users);
        return "redirect:/";
    }

    @RequestMapping(value = "/myCabinet={id}", method = RequestMethod.GET)
    public String myCabinet(@PathVariable String id, Model model){
        model.addAttribute("users",usersService.findById(Integer.parseInt(id)));
        return "user";
    }

    @RequestMapping(value = "/loginpage")
    public String login(){
        return "login";
    }

}

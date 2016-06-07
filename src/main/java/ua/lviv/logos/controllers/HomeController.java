package ua.lviv.logos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.logos.service.UsersService;

import javax.servlet.http.HttpSession;
import java.security.Principal;

/**
 * Created by user on 27/05/2016.
 */
@Controller
public class HomeController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(HttpSession httpSession, Principal principal) {
        if (principal==null) {
            return "redirect:/loginpage";
        } else {
            httpSession.setAttribute("loginedUser", usersService.findById(Integer.parseInt(principal.getName())));
            return "home";
        }
    }
}

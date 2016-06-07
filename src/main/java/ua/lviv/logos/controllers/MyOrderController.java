package ua.lviv.logos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.logos.entity.MyOrder;
import ua.lviv.logos.service.MyOrderService;

import java.util.Date;
import java.util.List;

/**
 * Created by user on 06/06/2016.
 */
@Controller
public class MyOrderController {

    @Autowired
    private MyOrderService myOrderService;

    @RequestMapping(value = "/myOrder-main", method = RequestMethod.GET)
    public String myOrderMain(){
        return "myOrder-main";
    }

    @RequestMapping(value = "/showAllOrders", method = RequestMethod.GET)
    public String showAllOrders(Model model){
        List<MyOrder> myOrderList = myOrderService.findAll();
        model.addAttribute("orders", myOrderList);
        return "myOrder-all";
    }

    @RequestMapping(value = "/newOrder", method = RequestMethod.GET)
    public String newOrder(Model model){
        return "myOrder-new";
    }

    @RequestMapping(value = "/createNewOrder", method = RequestMethod.POST)
    public String createNewOrder(@RequestParam(value = "customer") String customer, @RequestParam(value = "auto") String auto, @RequestParam(value = "price") double price, @RequestParam(value = "fin_type") String fin_type){
        myOrderService.add(customer, auto, price, fin_type);
        return "redirect:/showAllOrders";
    }

    @RequestMapping(value = "/findByCustomer", method = RequestMethod.GET)
    public String findByCustomer(Model model){
        return "myOrder-findByCustomer";
    }

    @RequestMapping(value = "/findOrderByCustomer", method = RequestMethod.POST)
    public String findOrderByCustomer(Model model, @RequestParam(value = "customer") String customer){
        List<MyOrder> myOrderList = myOrderService.findByCustomer(customer);
        model.addAttribute("orders", myOrderList);
        return "myOrder-findByCustomer";
    }

    @RequestMapping(value = "/findByOrderDate", method = RequestMethod.GET)
    public String findByOrderDate(Model model){
        return "myOrder-findByOrderDate";
    }

    @RequestMapping(value = "/findOrderByOrderDate", method = RequestMethod.POST)
    public String findOrderByOrderDate(Model model, @RequestParam(value = "order_date")Date order_date){
        List<MyOrder> myOrderList = myOrderService.findByOrderDate(order_date);
        model.addAttribute("orders", myOrderList);
        return "myOrder-findByOrderDate";
    }

    @RequestMapping(value = "/findByAuto", method = RequestMethod.GET)
    public String findByAuto(Model model){
        return "myOrder-findByAuto";
    }

    @RequestMapping(value = "/findOrderByAuto", method = RequestMethod.POST)
    public String findOrderByAuto(Model model, @RequestParam(value = "auto") String auto){
        List<MyOrder> myOrderList = myOrderService.findByAuto(auto);
        model.addAttribute("orders", myOrderList);
        return "myOrder-findByAuto";
    }

    @RequestMapping(value = "/findByFinType", method = RequestMethod.GET)
    public String findByFinType(Model model){
        return "myOrder-findByFinType";
    }

    @RequestMapping(value = "/findOrderByFinType", method = RequestMethod.POST)
    public String findOrderByFinType(Model model, @RequestParam(value = "fin_type") String fin_type){
        List<MyOrder> myOrderList = myOrderService.findByFinType(fin_type);
        model.addAttribute("orders", myOrderList);
        return "myOrder-findByFinType";
    }

    @RequestMapping(value = "/deleteOrder", method = RequestMethod.GET)
    public String deleteOrder(Model model){
        return "myOrder-delete";
    }

    @RequestMapping(value = "/deleteOrderById", method = RequestMethod.POST)
    public String deleteOrderById(@RequestParam(value = "id") int id){
        myOrderService.delete(id);
        return "redirect:/showAllOrders";
    }
}

package web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model,
                               @RequestParam (value = "count",required = false) Integer count) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarServiceImpl.class);
        CarService carService = context.getBean(CarServiceImpl.class);
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Car1",10,1));
        carList.add(new Car("Car2",20,2));
        carList.add(new Car("Car3",30,3));
        carList.add(new Car("Car4",40,4));
        carList.add(new Car("Car5",50,5));
        if ((count == null) || (count>6)) {count = 5;}
        List<Car> cars = carService.getList(carList, count);
        model.addAttribute("cars", cars);
        return "Cars";
    }



}
package ua.iobradovuch.lab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.iobradovuch.lab.models.Car;
import ua.iobradovuch.lab.models.User;
import ua.iobradovuch.lab.models.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping
    public String index(Model model) {
        //variables
        model.addAttribute("username", "John Doe");
        User user = new User("John Doe");
        model.addAttribute("user", user);

        //maps
        Map<String, String> capitalsOfTheWorld = new HashMap<>();
        capitalsOfTheWorld.put("Belgium", "Brussels");
        capitalsOfTheWorld.put("France", "Paris");
        capitalsOfTheWorld.put("Germany", "Berlin");
        capitalsOfTheWorld.put("The Netherlands", "Amsterdam");
        model.addAttribute("capitalsOfTheWorld", capitalsOfTheWorld);

        //arrays and lists
        List<Vehicle> vehiclesList = new ArrayList<>();
        vehiclesList.add(new Vehicle("Toyota Camry", "Sedan"));
        vehiclesList.add(new Vehicle("Honda Civic", "Hatchback"));
        vehiclesList.add(new Vehicle("Ford F-150", "Pickup Truck"));
        model.addAttribute("vehiclesList", vehiclesList);

        //selected objects
        Car car = new Car("Toyota","Sedan","Gasoline","Red");
        model.addAttribute("car", car);

        //iteration
        model.addAttribute("languages", List.of("Java", "Kotlin", "Groovy"));
        return "index";
    }
}
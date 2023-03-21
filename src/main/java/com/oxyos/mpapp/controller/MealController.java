package com.oxyos.mpapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxyos.mpapp.model.Meal;
import com.oxyos.mpapp.repository.MealRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MealController {
    
    @Autowired
    private MealRepository mealRepository;

    @GetMapping("/meals")
    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    @PostMapping("/addmeal")
    public Meal addMeal(@RequestBody Meal m) {
        return mealRepository.save(m);
    }
}

package com.oxyos.mpapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oxyos.mpapp.model.Meal;

public interface MealRepository extends JpaRepository<Meal, Long> {
    
    List<Meal> findByMealId(long mealId);
    List<Meal> findByDateId(long dateId);

}
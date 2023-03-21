package com.oxyos.mpapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="meal")
public class Meal {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private long id;
    
    @Column(name="meal_id", nullable = false) private long meal_id;
    @Column(name="date_id", nullable = false) private long date_id;
    @Column(name="meal_type", nullable=false) private String meal_type;
    @Column(name="meal_start_hour", nullable=false) private String meal_start_hour;
    @Column(name="meal_end_hour", nullable=false) private String meal_end_hour;


    @ManyToOne
    @JoinColumn(name="date")
    private Date date;

    public Meal() {

    }

    public Meal(long meal, long date, String type, String start, String end) {
        this.meal_id = meal;
        this.date_id = date;
        this.meal_type = type;
        this.meal_start_hour = start;
        this.meal_end_hour = end;
    }
    
    public long getMealId() {return meal_id;}
    public long getDateId() {return date_id;}
    public String getMealStartHour() {return meal_start_hour;}
    public String getMealEndHour() {return meal_end_hour;}
    public String getMealType() {return meal_type;}


    public void setMealId(long m) {this.meal_id = m;}
    public void setDateId(long d) {this.date_id = d;}
    public void setMealStartHour(String s) {this.meal_start_hour = s;}
    public void setMealEndHour(String e) {this.meal_end_hour = e;}
    public void setMealType(String t) {this.meal_type = t;}

}

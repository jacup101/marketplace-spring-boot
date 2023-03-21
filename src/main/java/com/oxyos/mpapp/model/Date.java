package com.oxyos.mpapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="date")
public class Date {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private long id;
    
    @Column(name="start_hour", length = 10, nullable = false) private String start_hour;
    @Column(name="end_hour", length = 10, nullable = false) private String end_hour;
    @Column(name="date", length = 12, nullable = false) String date;
    @Column(name="date_id", nullable = false) long date_id;

    public Date() {
        
    }
    
    public Date(long id, String date, String start, String end) {
        this.date_id = id;
        this.date = date;
        this.start_hour = start;
        this.end_hour = end;
    }

    public String getDate() {return date;}
    public String getStartHour() {return start_hour;}
    public String getEndHour() {return end_hour;}
    public long getDateId() {return date_id;}

    public void setDate(String d) {this.date = d;}
    public void setStartHour(String sh) {this.start_hour = sh;}
    public void setEndHour(String eh) {this.end_hour = eh;}
    public void setDateId(long di) {this.date_id = di;}
}

package com.oxyos.mpapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oxyos.mpapp.model.Date;

public interface DateRepository extends JpaRepository<Date, Long> {
    
    List<Date> findByDateId(long dateId);
    List<Date> findByDate(String date);

}
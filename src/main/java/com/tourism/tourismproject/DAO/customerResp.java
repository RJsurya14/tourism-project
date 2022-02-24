package com.tourism.tourismproject.DAO;

import com.tourism.tourismproject.Model.Booking;

import org.springframework.data.jpa.repository.JpaRepository;


public interface customerResp extends JpaRepository<Booking, String> {
    
}

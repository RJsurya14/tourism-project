package com.tourism.tourismproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import com.tourism.tourismproject.DAO.customerResp;
import com.tourism.tourismproject.Model.Booking;



@Controller

public class TourismController {
    @Autowired
    customerResp ld;


@RequestMapping("/")
public String home()
{
   return "index.jsp" ;
}
@GetMapping("/bookings")

public List<Booking> getBookings() {

return (List<Booking>)ld.findAll(); } 

@GetMapping("/booking/{cusname}") 
public Booking  
getBooking(@PathVariable String cusname) {

Booking b =ld.findById(cusname).orElse(new Booking());

 return b;
}

@PostMapping("/display") 
public Booking addBooking( @RequestBody Booking b) {

    ld.save(b); 
    return b;
    
    }
    @PutMapping("/transport/{cusname}")
	public Booking updateBooking(@PathVariable String cusname,@RequestBody Booking b)
	{
		Booking acc = ld.findById(cusname).orElse(b);
		acc.setPackage1(b.getPackage1());
		acc.setTransport(b.getTransport());
		
		ld.save(acc);
		return acc;
	}
	
	@DeleteMapping("/deletecustomer/{cusname}")
	public String deleteBooking(@PathVariable String cusname){
		Booking b = ld.findById(cusname).orElse(new Booking());
		ld.delete(b);
		return "Booking deleted";
	}

    }



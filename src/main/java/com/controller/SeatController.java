package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Seat;
import com.service.SeatServices;

@Controller
@RequestMapping("/seat")
public class SeatController {

	@Autowired
	private SeatServices seatService;

	
	
	@GetMapping("/list")
	public String showForm(Model model) {

		List<Seat> seats = seatService.getSeatList();

		model.addAttribute("seat", seats);

		return "seat-list";
	}

	
	@GetMapping("/book")
	public String bookticket(@RequestParam("seatnumber") int seatNumber) {

		boolean bookingStatus = seatService.isBooked(seatNumber);

		if (!bookingStatus) {

			seatService.setSeatList(seatNumber);

			return "booking-confirmation";
		} else {

			return "booking-denied";
		}

	}

	
	@GetMapping("/canclebook")
	public String canclebooking(@RequestParam("seatnumber") int seatNumber) {

		seatService.cancleBooking(seatNumber);

		return "redirect:/seat/list";
	}

	
	
}

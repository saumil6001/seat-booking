package com.service;

import java.util.List;

import com.entity.Seat;

public interface SeatServices {

	
	 List<Seat> getSeatList();

	void setSeatList(int seatNumber);

	boolean isBooked(int seatNumber);

	void cancleBooking(int seatNumber);
	
}

package com.dao;

import java.util.List;

import com.entity.Seat;

public interface SeatDau {

	
	List<Seat> getSeatlist();
	void setSeatList(int seatNumber);
	boolean isBooked(int seatNumber);
	void cancleBooking(int seatNumber);
	
}

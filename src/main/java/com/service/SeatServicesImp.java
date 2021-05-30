package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SeatDau;
import com.entity.Seat;



@Service
public class SeatServicesImp implements SeatServices {

	@Autowired
	private SeatDau seatDau;

	@Override
	@Transactional
	public List<Seat> getSeatList() {
		return seatDau.getSeatlist();
	}

	@Override
	@Transactional
	public void setSeatList(int seatNumber) {
	
		seatDau.setSeatList(seatNumber);
	
	}

	
	@Override
	@Transactional
	public boolean isBooked(int seatNumber) {
		
		return seatDau.isBooked(seatNumber);
	}


	
	@Override
	@Transactional
	public void cancleBooking(int seatNumber) {
	
		seatDau.cancleBooking(seatNumber);	
	}


	
	
	
	
	
	
}

package com.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Seat;


@Repository
public class SeatDauImp implements SeatDau {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Seat> getSeatlist() {

		Session session = sessionFactory.getCurrentSession();
		Query<Seat> query = session.createQuery("from Seat", Seat.class);
		List<Seat> seats = query.getResultList();
		return seats;
	}

	@Override
	public void setSeatList(int seatNumber) {
		
		Session session = sessionFactory.getCurrentSession();
		Seat seat= session.get(Seat.class, seatNumber);
		
		seat.setBookingStatus(true);
		
		
	}

	@Override
	public boolean isBooked(int seatNumber) {
	
		Session session = sessionFactory.getCurrentSession();
		Seat seat= session.get(Seat.class, seatNumber);
		
		return seat.isBookingStatus();
	}

	@Override
	public void cancleBooking(int seatNumber) {

		Session session = sessionFactory.getCurrentSession();
		Seat seat= session.get(Seat.class, seatNumber);
		
		seat.setBookingStatus(false);
		
	}
	
	
}

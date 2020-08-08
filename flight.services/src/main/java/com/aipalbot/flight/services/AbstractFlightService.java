package com.aipalbot.flight.services;


import com.aipalbot.flight.models.Card;
import com.aipalbot.flight.models.Flight;
import com.aipalbot.flight.models.Passenger;
import com.aipalbot.flight.models.Person;
import com.aipalbot.flight.models.Pet;
import com.aipalbot.flight.models.Receipt;
import com.aipalbot.flight.services.interfaces.IPaymentService;

public abstract class AbstractFlightService implements IPaymentService{

	@Override
	public Passenger reserveSeat(Person person, Pet pet, String luggage, String flightName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Receipt prepareReservation(Person person, Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showAvailableSeats(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showReservedSeats(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Receipt bookFlight(Receipt p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reserveFlight(Person p, Card c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean performDebit(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateBalance(Card card, double money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyCar(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

}

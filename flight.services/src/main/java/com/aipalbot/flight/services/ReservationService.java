package com.aipalbot.flight.services;

import java.util.Map;

import com.aipalbot.flight.models.Card;
import com.aipalbot.flight.models.Flight;
import com.aipalbot.flight.models.Passenger;
import com.aipalbot.flight.models.Person;
import com.aipalbot.flight.models.Pet;
import com.aipalbot.flight.models.Receipt;
import com.aipalbot.flight.models.Seat;
import com.aipalbot.flight.services.factory.FlightFactory;
import com.aipalbot.flight.services.interfaces.IReservationService;

public class ReservationService implements IReservationService{

	private FlightFactory factory;
	public ReservationService(FlightFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public Receipt prepareReservation(Person person, Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger reserveSeat(Person person, Pet pet, String luggage, String flightName) {
		Flight flight = factory.createFlight(flightName);
		Passenger passenger = new Passenger();
		passenger.setPerson(person);
		passenger.setPet(pet);
		passenger.setLuggage(luggage);
		
		
		
		
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showAvailableSeats(Flight flight) {
		//Iteration of Map
		Map<String, Seat> seats = flight.getSeats();
		//List of unassigened seats
		//concatenation of values == "F"+"A"
		String availableSeats=""; // immutable 
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, Seat> entry: flight.getSeats().entrySet()) {
			//each entry contains Key and Value, example, this will contain seatNo and Seat
			String key = entry.getKey();
			Seat seat = entry.getValue();
			if(seat.getPassenger()==null) {
				String val = seat.getSeatNo()+" "+ seat.getLocation().toString();
				sb.append(val);
			}
		}

		return null;
	}

	@Override
	public String showReservedSeats(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

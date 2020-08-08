package com.aipalbot.flight.services;

import com.aipalbot.flight.models.Card;
import com.aipalbot.flight.models.Person;
import com.aipalbot.flight.models.Receipt;
import com.aipalbot.flight.services.interfaces.IFlightService;
import com.aipalbot.flight.services.interfaces.IReservationService;

public class FlightService implements IFlightService {

	public IReservationService rsv;
	
	public FlightService(IReservationService rsv) {
			this.rsv = rsv;
	}
	
	
	@Override
	public Receipt bookFlight(Receipt p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reserveFlight(Person p, Card c) {

		this.rsv.prepareReservation(p, c);
		
		return null;
	}

}

package com.aipalbot.flight.services.interfaces;

import com.aipalbot.flight.models.Card;
import com.aipalbot.flight.models.Person;
import com.aipalbot.flight.models.Receipt;

public interface IFlightService {
	public Receipt bookFlight(Receipt p);
	public String reserveFlight(Person p, Card c);
}

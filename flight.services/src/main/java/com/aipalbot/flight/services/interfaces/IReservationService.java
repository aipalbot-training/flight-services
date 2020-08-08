package com.aipalbot.flight.services.interfaces;

import com.aipalbot.flight.models.Card;
import com.aipalbot.flight.models.Flight;
import com.aipalbot.flight.models.Passenger;
import com.aipalbot.flight.models.Person;
import com.aipalbot.flight.models.Pet;
import com.aipalbot.flight.models.Receipt;

public interface IReservationService {

	public Passenger reserveSeat(Person person, Pet pet, String luggage, String flightName);
	public Receipt prepareReservation(Person person, Card card);
	public String showAvailableSeats(Flight flight);
	public String showReservedSeats(Flight flight);
	
}

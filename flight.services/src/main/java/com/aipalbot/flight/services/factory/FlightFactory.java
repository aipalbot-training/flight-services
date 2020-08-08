package com.aipalbot.flight.services.factory;

import java.util.HashMap;
import java.util.Map;

import com.aipalbot.flight.models.DeltaAirline;
import com.aipalbot.flight.models.Flight;
import com.aipalbot.flight.models.Seat;
import com.aipalbot.flight.models.UnitedAirline;
import com.aipalbot.flight.utils.AirportCode;
import com.aipalbot.flight.utils.Color;
import com.aipalbot.flight.utils.FlightName;
import com.aipalbot.flight.utils.Location;
import com.aipalbot.flight.utils.Terminal;


public class FlightFactory {

	public Flight createFlight(String flightName ) {
		
		if(flightName.equalsIgnoreCase(FlightName.DeltaAirline.toString())){
			
			double discount = 0.1; //10%
			Flight deltaAirline = new DeltaAirline(discount);
			deltaAirline.setColor(Color.Orange);
			deltaAirline.setArrival(AirportCode.JFK);
			deltaAirline.setDeparture(AirportCode.LAS);
			deltaAirline.setFlightNo("DAL-1000");
			deltaAirline.setTerminal(Terminal.D);
			Map<String,Seat> seats = createSeats(3);
			deltaAirline.setSeats(seats);
			//set more properties
			
			return deltaAirline;
		}else if (flightName.equalsIgnoreCase(FlightName.UnitedAirline.toString())) {
			
			int promoCode = 2010;
			Flight unitedAirline = new UnitedAirline(promoCode);
			unitedAirline.setColor(Color.White);
			unitedAirline.setArrival(AirportCode.JFK);
			unitedAirline.setDeparture(AirportCode.PHL);
			unitedAirline.setFlightNo("UAL-1000");
			unitedAirline.setTerminal(Terminal.A);
			
			Map<String,Seat> seats = createSeats(4);
			unitedAirline.setSeats(seats);
			return unitedAirline;
			
		}else {
			return null;  // Exception -- Error handling, try and catch 
		}
		
	}
	
	private Map<String,Seat> createSeats(int flightMaxSeat){
		Map<String,Seat>	seats = new HashMap<>();
		// "F1-F20"  -- A1
		//A1-- A3
		//B2--B3
		//C1--C3		
		int count =1;		
		for(int i=1; i<flightMaxSeat;i++)
		{
			Seat seat = new Seat();
			seat.setSeatNo("A"+count); // A1, A2, A3
			seat.setLocation(Location.Left);			
			seats.put(seat.getSeatNo(), seat);	
			count++;
		}
		
		return seats;
	}
	
	
}

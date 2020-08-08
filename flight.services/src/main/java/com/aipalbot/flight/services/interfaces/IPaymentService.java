package com.aipalbot.flight.services.interfaces;

import com.aipalbot.flight.models.Card;

public interface IPaymentService extends IFlightService, IReservationService {
	boolean performDebit(Card card);	
	void updateBalance(Card card, double money);
	boolean verifyCar(Card card);
	
}

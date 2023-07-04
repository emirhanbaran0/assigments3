package com.emirhanbaran.assigments.Entities;

import com.emirhanbaran.assigments.Business.THYBusinessService;
import com.emirhanbaran.assigments.Entities.Services.DomesticFlight;
import com.emirhanbaran.assigments.Entities.Services.FoodService;

public class THYYurtici extends THY implements DomesticFlight {


    public THYYurtici(THYBusinessService thyBusinessService) {
        super(thyBusinessService);
        thyBusinessService.setNormalSeats(this);
        thyBusinessService.setBusinessSeats(this);
    }

    @Override
    public void calculateTicketPrice(double distance, int personNumber, boolean isBusinessTicket, double weightOfLuggage) {

    }
}

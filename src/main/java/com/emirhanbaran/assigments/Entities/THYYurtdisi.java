package com.emirhanbaran.assigments.Entities;

import com.emirhanbaran.assigments.Business.THYBusinessService;
import com.emirhanbaran.assigments.Entities.Services.InternationalFlight;

public class THYYurtdisi extends THY implements InternationalFlight {


    public THYYurtdisi(THYBusinessService thyBusinessService) {
        super(thyBusinessService);
        thyBusinessService.setBusinessSeats(this);
        thyBusinessService.setNormalSeats(this);
    }


    @Override
    public void calculateTicketPrice(double distance, int personNumber, boolean isBusinessTicket, double weightOfLuggage) {
                if(isBusinessTicket)
                    thyBusinessService.calculateYurtDisiBusinessTicketPrice(this,distance,personNumber,weightOfLuggage);
    }
}

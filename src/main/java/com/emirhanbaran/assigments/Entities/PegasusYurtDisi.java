package com.emirhanbaran.assigments.Entities;

import com.emirhanbaran.assigments.Business.PegasusBusinessService;
import com.emirhanbaran.assigments.Entities.Services.FoodService;
import com.emirhanbaran.assigments.Entities.Services.InternationalFlight;

public class PegasusYurtDisi extends Pegasus implements InternationalFlight, FoodService {

    public PegasusYurtDisi(PegasusBusinessService pegasusBusinessService) {
        super(pegasusBusinessService);
        pegasusBusinessService.setBusinessSeats(this);
        pegasusBusinessService.setNormalSeats(this);
    }

    @Override
    public void foodService() {
        System.out.println("Bu uçuşta yemek servis hizmeti verilmektedir. Pegasus ile iyi uçuşlar dileriz...");
    }


    @Override
    public void calculateTicketPrice(double distance,int personNumber,boolean isBusinessTicket) {
        if(isBusinessTicket)
            pegasusBusinessService.calculateYurtIciBusinessTicketPrice(this,distance,personNumber);
        else
        pegasusBusinessService.calculateYurtIciNormalTicketPrice(this,distance,personNumber);
    }
}

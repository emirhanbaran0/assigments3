package com.emirhanbaran.assigments.Entities;

import com.emirhanbaran.assigments.Business.PegasusBusinessService;
import com.emirhanbaran.assigments.Entities.Services.DomesticFlight;

public class PegasusYurtici extends Pegasus implements DomesticFlight {

    public PegasusYurtici(PegasusBusinessService pegasusBusinessService) {
        super(pegasusBusinessService);
        pegasusBusinessService.setNormalSeats(this);
        pegasusBusinessService.setBusinessSeats(this);
    }

    @Override
    public void calculateTicketPrice(double distance,int personNumber,boolean isBusiness) {
      if(isBusiness)
          pegasusBusinessService.calculateYurtDisiBusinessTicketPrice(this,distance,personNumber);
      else
          pegasusBusinessService.calculateYurtDisiNormalTicketPrice(this,distance,personNumber);
    }

}

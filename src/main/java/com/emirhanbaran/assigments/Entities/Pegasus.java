package com.emirhanbaran.assigments.Entities;


import com.emirhanbaran.assigments.Business.PegasusBusinessService;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public abstract class Pegasus extends Aeroplane {

    protected final PegasusBusinessService pegasusBusinessService;

    public abstract void calculateTicketPrice(double distance,int personNumber,boolean isBusinessTicket);

    public void getEmptySeats(){
        System.out.println("Normal Ücretli Biletler için boş olan koltuklar:");
        pegasusBusinessService.showEmptySeats(this.getNormalSeats());
        System.out.println("Business Ücretli Biletler için boş olan koltuklar:");
        pegasusBusinessService.showEmptySeats(this.getBusinessSeats());
    }
}

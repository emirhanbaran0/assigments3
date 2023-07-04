package com.emirhanbaran.assigments.Entities;

import com.emirhanbaran.assigments.Business.THYBusinessService;
import com.emirhanbaran.assigments.Entities.Services.FoodService;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public abstract class THY extends Aeroplane implements FoodService {

    protected final THYBusinessService thyBusinessService;

    @Override
    public void foodService() {
        System.out.println("Bu uçuşta yemek servis hizmeti bulunmaktadır. THY ile iyi uçuşlar dileriz.");
    }

    public abstract void calculateTicketPrice(double distance,int personNumber,boolean isBusinessTicket,double weightOfLuggage);
    public void getEmptySeats(){
        System.out.println("Normal Ücretli Biletler için boş olan koltuklar:");
        thyBusinessService.showEmptySeats(this.getNormalSeats());
        System.out.println("Business Ücretli Biletler için boş olan koltuklar:");
        thyBusinessService.showEmptySeats(this.getBusinessSeats());
    }
}

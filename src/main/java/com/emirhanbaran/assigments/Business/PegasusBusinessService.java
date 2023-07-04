package com.emirhanbaran.assigments.Business;

import com.emirhanbaran.assigments.Entities.Pegasus;

import java.util.HashMap;

public class PegasusBusinessService {

    private static final Double BUSINESSPRICE=2.5;
    private static final Double INTERNATIONALFLIGHT=1.6;
    public void setBusinessSeats(Pegasus pegasus){
        HashMap<String,Boolean> temp=new HashMap<>();
        for(int i=0;i<pegasus.getBusinessSeatcapacity();i++){
            temp.put("A"+i,true);
            temp.put("B"+i,true);
            temp.put("C"+i,true);
            temp.put("D"+i,true);
            temp.put("E"+i,true);
            temp.put("F"+i,true);
        }
        pegasus.setBusinessSeats(temp);
    }

    public void setNormalSeats(Pegasus pegasus){
        HashMap<String,Boolean> temp=new HashMap<>();
        for(int i=0;i<pegasus.getNormalSeatcapacity();i++){
            temp.put("A"+i,true);
            temp.put("B"+i,true);
            temp.put("C"+i,true);
            temp.put("D"+i,true);
            temp.put("E"+i,true);
            temp.put("F"+i,true);
        }
        pegasus.setNormalSeats(temp);
    }


    public void calculateYurtIciNormalTicketPrice(Pegasus pegasus,double distance, int personNumber) {
            pegasus.setNormalTicketPrice(distance*personNumber);
    }

    public void calculateYurtIciBusinessTicketPrice(Pegasus pegasus,double distance, int personNumber) {
        pegasus.setNormalTicketPrice(distance*personNumber*BUSINESSPRICE);
    }

    public void calculateYurtDisiNormalTicketPrice(Pegasus pegasus,double distance, int personNumber) {
        pegasus.setNormalTicketPrice(distance*personNumber*INTERNATIONALFLIGHT);
    }

    public void calculateYurtDisiBusinessTicketPrice(Pegasus pegasus,double distance, int personNumber) {
        pegasus.setNormalTicketPrice(distance*personNumber*INTERNATIONALFLIGHT*BUSINESSPRICE);
    }

    public void showEmptySeats(HashMap<String,Boolean> normalSeatList){
        for(int i=1;i<= normalSeatList.size()/6;i++){
            if(normalSeatList.get("A"+i))
                System.out.println("A"+i);
            else if (normalSeatList.get("B"+i)) {
                System.out.println("B"+i);
            }
            else if (normalSeatList.get("C"+i)) {
                System.out.println("C"+i);
            }
            else if (normalSeatList.get("D"+i)) {
                System.out.println("D"+i);
            }
            else if (normalSeatList.get("D"+i)) {
                System.out.println("D"+i);
            }
            else if (normalSeatList.get("F"+i)) {
                System.out.println("F"+i);
            }
        }
    }
}



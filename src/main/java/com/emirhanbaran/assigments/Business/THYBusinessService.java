package com.emirhanbaran.assigments.Business;

import com.emirhanbaran.assigments.Entities.Pegasus;
import com.emirhanbaran.assigments.Entities.THY;

import java.util.HashMap;
import java.util.Set;

public class THYBusinessService {

    private static final Double BUSINESSPRICE=500.0;
    private static final Double INTERNATIONALFLIGHT=2500.0;
    public void setBusinessSeats(THY thy){
        HashMap<String,Boolean> temp=new HashMap<>();
        for(int i=1;i<=thy.getBusinessSeatcapacity();i++){
            temp.put("A"+i,true);
            temp.put("B"+i,true);
            temp.put("C"+i,true);
            temp.put("D"+i,true);
            temp.put("E"+i,true);
            temp.put("F"+i,true);
        }
        thy.setBusinessSeats(temp);
    }

    public void setNormalSeats(THY thy){
        HashMap<String,Boolean> temp=new HashMap<>();
        for(int i=1;i<=thy.getNormalSeatcapacity();i++){
            temp.put("A"+i,true);
            temp.put("B"+i,true);
            temp.put("C"+i,true);
            temp.put("D"+i,true);
            temp.put("E"+i,true);
            temp.put("F"+i,true);
        }
        thy.setNormalSeats(temp);
    }

    public void calculateYurtIciNormalTicketPrice(THY thy, double distance, int personNumber,double weightOfLuggage) {
        thy.setNormalTicketPrice(distance*personNumber*weightOfLuggage);
    }

    public void calculateYurtIciBusinessTicketPrice( THY thy,double distance, int personNumber,double weightOfLuggage) {
        thy.setNormalTicketPrice(distance*personNumber*weightOfLuggage+(BUSINESSPRICE));
    }

    public void calculateYurtDisiNormalTicketPrice(THY thy ,double distance, int personNumber,double weightOfLuggage) {
        thy.setNormalTicketPrice(distance*personNumber*weightOfLuggage+(INTERNATIONALFLIGHT));
    }

    public void calculateYurtDisiBusinessTicketPrice(THY thy,double distance, int personNumber,double weightOfLuggage) {
        thy.setNormalTicketPrice(distance*personNumber*weightOfLuggage+(BUSINESSPRICE+INTERNATIONALFLIGHT));
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

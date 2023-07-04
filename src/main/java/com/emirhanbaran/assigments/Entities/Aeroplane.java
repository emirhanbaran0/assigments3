package com.emirhanbaran.assigments.Entities;
import lombok.Data;
import java.util.HashMap;

@Data
public abstract class Aeroplane {

    protected int normalSeatcapacity;
    protected int businessSeatcapacity;
    protected String model;
    protected HashMap<String,Boolean> normalSeats;
    protected HashMap<String,Boolean> businessSeats;
    protected double businessTicketPrice;
    protected double normalTicketPrice;
}

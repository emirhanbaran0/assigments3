package com.emirhanbaran.assigments.Entities.Factory;

import com.emirhanbaran.assigments.Business.PegasusBusinessService;

import com.emirhanbaran.assigments.Business.THYBusinessService;
import com.emirhanbaran.assigments.Entities.*;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AeroPlaneFactory {

    private final PegasusBusinessService pegasusBusinessService;
    private final THYBusinessService thyBusinessService;
    public  Aeroplane createPlane(String companyName){
        switch (companyName){
            case "THY Yurt İçi":
                return new THYYurtici(thyBusinessService);
            case "THY Yurt Dışı":
                return new THYYurtdisi(thyBusinessService);
            case "Pegasus Yurt İçi":
                return new PegasusYurtici(pegasusBusinessService);
            case "Pegasus Yurt Dışı":
                return new PegasusYurtDisi(pegasusBusinessService);
            default:
                return new THYYurtici(thyBusinessService);
        }

    }
}

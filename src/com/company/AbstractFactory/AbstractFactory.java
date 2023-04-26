package com.company.AbstractFactory;

import com.company.ConcreteClasses.Area;
import com.company.Factory.CleaningFactory;
import com.company.Factory.RentFactory;

public abstract class AbstractFactory {

    public static AbstractFactory invokeDesignatedFactory(String service){
        if(service.equalsIgnoreCase("RENT"))
            return new RentFactory();
        else
             return new CleaningFactory() ;
    }

    public abstract Area getArea(String areaName);




}

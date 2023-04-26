package com.company.Factory;

import com.company.AbstractFactory.AbstractFactory;
import com.company.ConcreteClasses.*;

public class RentFactory extends AbstractFactory {
    @Override
    public Area getArea(String areaname){
        if(areaname.equalsIgnoreCase("MARATHALI"))
            return new MarathaliClass();
        if(areaname.equalsIgnoreCase("SARAJPUR"))
            return new SarajpurClass();
        if(areaname.equalsIgnoreCase("KORMANGLA"))
            return new KorManglaClass();
        if(areaname.equalsIgnoreCase("ELECTRONICITY"))
            return new ElectronicCityClass();
        return null;

    }



}

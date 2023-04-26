package com.company.Factory;

import com.company.AbstractFactory.AbstractFactory;
import com.company.ConcreteClasses.*;

public class CleaningFactory extends AbstractFactory {

    @Override
    public Area getArea(String areaname){
            if(areaname.equalsIgnoreCase("SOFA"))
                return new SofaCleaning();
            if(areaname.equalsIgnoreCase("KITCHEN"))
                return new KitchenCleaning();
            if(areaname.equalsIgnoreCase("FULLHOME"))
                return new FullHomeCleaning();
            if(areaname.equalsIgnoreCase("BATHROOM"))
                return new BathroomCleaning();
            return null;

        }



}

package com.company;

import com.company.AbstractFactory.AbstractFactory;
import com.company.ConcreteClasses.Area;
import com.company.ConcreteClasses.MarathaliClass;
import com.company.ConcreteClasses.SofaCleaning;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello I am Abstract Factory Design Pattern");

        String Service="RENT";
        AbstractFactory factory = AbstractFactory.invokeDesignatedFactory(Service);
        Area area= factory.getArea("MARATHALI");
        System.out.println(area.getCost());


        Service="CLEANING";
        AbstractFactory factory1=AbstractFactory.invokeDesignatedFactory(Service);
        Area area1=factory1.getArea("SOFA");
        System.out.println(area1.getCost());



    }
}

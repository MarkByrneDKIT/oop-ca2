package com.dkit.oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name: Mark Byrne
 * <p>
 * Your GitHub link: origin	https://github.com/MarkByrneDKIT/oop-ca2.git
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Q1 - some simple tests");

        ArrayList<String> facilitiesP1 = new ArrayList<>();


        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130, facilitiesP1);
        p1.addFacility("toilet");
        System.out.println("Property p1 details:");


        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea() + " : " + p1.getFacilities());

        ArrayList<String> facilitiesP2 = new ArrayList<>();


        Property p2 = new Property(2,"Mark Byrne", "A91RD30",420, facilitiesP2);
        System.out.println(p2.toString());

        p2.addFacility("toilet");
        p2.addFacility("bathroom");

        System.out.println("Name a facility that you want to remove");
        String facilityRemove = keyboard.nextLine();

        p2.removeFacility(facilityRemove);

        for(int i = 0;i < facilitiesP2.size(); i++)
        {
            System.out.println(facilitiesP2.get(i));
        }

        p2.calculateTax();





        System.out.println("Q2 - tests");

        ArrayList<Property> propertiesAboveBoundary = new ArrayList<>();

        ArrayList<Property> properties = new ArrayList<>();
        properties.add(p1);
        properties.add(p2);

        Property p3 = new Property(3,"Richard Collins", "A948743", 32000,456, facilitiesP2);

        properties.add(p3);

        for(int i = 0; i < properties.size(); i++)
        {
            System.out.println(properties.get(i));
        }

        propertiesAboveBoundary = getPropertyPicesAbove(properties, 30000);


        for(int i = 0; i < propertiesAboveBoundary.size(); i++)
        {
            System.out.println(propertiesAboveBoundary.get(i));
        }




        System.out.println("Q3 - tests");


        ArrayList<Property> privateProperties = new ArrayList<>();

        ArrayList<String> facilitiespriv1 = new ArrayList<>();
        ArrayList<String> facilitiespriv2 = new ArrayList<>();
        ArrayList<String> facilitiespriv3 = new ArrayList<>();

        PrivateProperty priv1 = new PrivateProperty(17,"Aaron Carter", "A91rd38", 3467,278, facilitiespriv1, 4, "bungalo");
        PrivateProperty priv2 = new PrivateProperty(18,"Luke Kinsella", "A92rd67", 4357,300, facilitiespriv2, 4, "Semi-D");
        PrivateProperty priv3 = new PrivateProperty(19,"Sean Winters", "A93rd82", 1098,678, facilitiespriv3, 4, "Detatched");

        privateProperties.add(priv1);
        privateProperties.add(priv2);
        privateProperties.add(priv3);

        for(int i = 0; i < privateProperties.size(); i++)
        {
            System.out.println(privateProperties.get(i));
        }

        priv1.calculateTax();

        for(int i = 0; i < privateProperties.size(); i++)
        {
            System.out.println(privateProperties.get(i));
        }





        System.out.println("Q4 - tests");




    }
    public ArrayList<Property> getPropertyPicesAbove(ArrayList<Property> properties, int boundaryPrice)
    {
        ArrayList<Property> sellingOverBoundaryProperties = new ArrayList<>();

        for(int i = 0; i < properties.size(); i++)
        {
            if(properties.contains(boundaryPrice))
            {
                sellingOverBoundaryProperties.add(properties.get(i));
            }

        }

        return sellingOverBoundaryProperties;
    }



}


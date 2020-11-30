package com.dkit.oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name:
 * <p>
 * Your GitHub link:
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

        ArrayList<Property> properties = new ArrayList<>();
        properties.add(p1);
        properties.add(p2);






        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }



}


package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;



public class Property
{

    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;
    private ArrayList<String> facilities;

    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area, ArrayList<String> facilities)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = sellingPrice;
        this.area = area;
        this.facilities = facilities;
    }


    public Property(int propertyID, String owner, String postcode, double area, ArrayList<String> facilities)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = 20000;
        this.area = area;
        this.facilities = facilities;
    }

    public int getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(int propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public ArrayList<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(ArrayList<String> facilities) {
        this.facilities = facilities;
    }

    public void addFacility(String facility)
    {

        facilities.add(facility);

    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return propertyID == property.propertyID &&
                owner.equals(property.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyID, owner);
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyID=" + propertyID +
                ", owner='" + owner + '\'' +
                ", postcode='" + postcode + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", area=" + area +
                ", facilities=" + facilities +
                '}';
    }

    public void removeFacility(String facilityRemove)
    {
        facilities.remove(facilityRemove);
    }

    public void calculateTax()
    {
        double tax = area * 2.2;
        tax = tax + 15;
        System.out.println("Yearly property tax is " + tax);
    }




}

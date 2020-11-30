package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;

public class PrivateProperty extends Property
{

    private int numBeds;
    private String propertyType;


    public PrivateProperty(int propertyID, String owner, String postcode, double sellingPrice, double area, ArrayList<String> facilities, int numBeds, String propertyType)
    {
        super(propertyID, owner, postcode, sellingPrice, area, facilities);
        this.numBeds = numBeds;
        this.propertyType = propertyType;
    }


    public int getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    @Override
    public String toString() {
        return "PrivateProperty{" +
                "propertyID " + super.getPropertyID() +
                ", owner " + super.getOwner() +
                ", postcode " + super.getPostcode() +
                ", sellingPrice " + super.getSellingPrice() +
                ", area " + super.getArea() +
                ", facilities " + super.getFacilities() +
                ", numBeds=" + numBeds +
                ", propertyType='" + propertyType + '\'' +
                '}';
    }


    @Override
    public void calculateTax() {
        double area = getArea();
        int numbeds = getNumBeds();

        double tax = area * 2.2;
        tax = tax + 15;
        tax = tax + (numbeds * 25);
        System.out.println("Yearly tax of private property " + getPropertyID() + " is:" + tax);

    }
}

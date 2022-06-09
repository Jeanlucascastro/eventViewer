package com.gedal.eventviewer.rent;

public class rentTax implements rentValue {

    public static double sumTax(int days, double tax){

        double full = days * tax;
4
        return full;
    }
}

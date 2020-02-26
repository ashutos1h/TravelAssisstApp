package com.all.journeyplanner.travelassist.model;

import java.util.List;

public class AssistanceProvider {
    public AssistanceProvider(){}

    private String Charges;
    
    List<Item> item;

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public String getCharges() {
        return Charges;
    }

    public void setCharges(int Charges) {
        this.Charges = "Category" +Charges;
    }
}

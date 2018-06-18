package com.company;

import java.util.ArrayList;

public class Colleges {

    ArrayList<String> colleges;

    public Colleges() {
    }

    public ArrayList<String> getColleges() {
        return colleges;
    }

    public void setColleges(ArrayList<String> colleges) {
        this.colleges = colleges;
    }

    @Override
    public String toString() {
        String display = "";
        for(String ed:colleges){

            display = display+ed+ " \n";
        }
        return display;
    }
}

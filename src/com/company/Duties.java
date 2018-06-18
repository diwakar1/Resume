package com.company;

import java.util.ArrayList;

public class Duties {

    ArrayList<String> duties;

    public ArrayList<String> getDuties() {
        return duties;
    }

    public void setDuties(ArrayList<String> duties) {
        this.duties = duties;
    }

    @Override
    public String toString() {
        String display = "";
        for(String ed:duties){

            display = display+ed+"\n ";
        }
        return display;
    }
}

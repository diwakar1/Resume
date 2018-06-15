package com.company;

import java.util.ArrayList;

public class Experience {


   ArrayList<String>experience;


    public Experience() {
    }



    public ArrayList<String> getExperience() {
        return experience;
    }

    public void setExperience(ArrayList<String> experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        String display = "";
        for(String ed:experience){

            display = display+ed+"\n ";
        }
        return display;
    }
}

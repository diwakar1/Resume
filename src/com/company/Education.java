package com.company;

import java.util.ArrayList;

public class Education {
    ArrayList<String> education;

    public Education() {
    }

    public ArrayList<String> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<String> education) {
        this.education = education;
    }

    @Override
    public String toString() {
        String display = "";
        for(String ed:education){

            display = display+ed+ " \n";
        }
        return display;
    }
}

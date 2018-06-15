package com.company;

import java.util.ArrayList;

public class Skill {
    ArrayList<String>skill;

    public Skill() {
    }

    public ArrayList<String> getSkill() {
        return skill;
    }

    public void setSkill(ArrayList<String> skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        String display = "";
        for(String ed:skill){

            display = display+ed+ " \n";
        }
        return display;
    }

}

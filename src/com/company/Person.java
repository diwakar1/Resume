package com.company;

public class Person {

    Education education;
    Experience experience;
    Skill skill;

    public Person() {

        this.education= new Education();
        this.experience = new Experience();
        this.skill = new Skill();


    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}

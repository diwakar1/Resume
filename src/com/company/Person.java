package com.company;

public class Person {

    Education education;
    Experience experience;
    Skill skill;
    Colleges colleges;
    Duties duties;

    public Person() {

        this.education= new Education();
        this.experience = new Experience();
        this.skill = new Skill();
        this.colleges = new Colleges();
        this.duties = new Duties();


    }

    public Colleges getColleges() {
        return colleges;
    }

    public void setColleges(Colleges colleges) {
        this.colleges = colleges;
    }

    public Duties getDuties() {
        return duties;
    }

    public void setDuties(Duties duties) {
        this.duties = duties;
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

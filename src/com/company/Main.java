package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String e = "Education";
        String ex = "Experience";
        String sk = "Skills";
        String answer;
        String r =  "Resume";

        Scanner input = new Scanner(System.in);


        Person person = new Person();


        ArrayList<String> educationList = new ArrayList<>(10);
        ArrayList<String> experienceList = new ArrayList<>(10);
        ArrayList<String> skillList = new ArrayList<>(10);


        System.out.println(" You are entering your resume. please enter your name");
        String name = input.nextLine();

        System.out.println(" please enter your email address: ");
        String email = input.nextLine();



        //int countNumber = 1;

        do {

            System.out.println(" enter your education ");
            String edu = input.nextLine();


            System.out.println(" enter your experience. ");
            String exp = input.nextLine();

            System.out.println(" enter your skill: ");
            String skil = input.nextLine();


            educationList.add(edu);
            experienceList.add(exp);
            skillList.add(skil);


            person.education.setEducation(educationList);
            person.experience.setExperience(experienceList);
            person.skill.setSkill(skillList);


            System.out.println(" do you want to continue? if you want to continue: press (y) otherwise press(n)");
            answer = input.nextLine();


        } while (answer.equalsIgnoreCase("y") );





        System.out.println("=========================================================");

        System.out.println("\t\t\t\t\t\t"+ r );


            System.out.println( "Name: "+"\n" + name + "\n");
            System.out.println("Email: "+ "\n"+email + "\n");

            System.out.println(  e + " \n");
            System.out.println(person.education.toString() );

            System.out.println("\n" + ex);
            System.out.println(person.experience.toString() );


            System.out.println("\n" + sk);
            System.out.println(person.skill.toString() );
        }
    }



















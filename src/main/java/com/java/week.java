package com.java;

import java.util.ArrayList;
import java.util.List;

public class Week {

    String[] days = {"Lunes","Martes", "Miércoles", "Jueves", "Viernes", "Sabado","Domingo"};
    List<String> week = new ArrayList<>();

    public Week() {
        this.addDay();
    } 
        
    public void addDay(){
        for (String day : days) {
            week.add(day);
        }
    }

    public void printDays(){
        week.forEach((day)->{System.out.println(day);});
    }

    public void printSize(){
        System.out.println();
    }
}
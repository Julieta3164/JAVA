package com.java;

import java.util.List;

public class Week{

    private String[]list = {"Lunes","Martes", "Miércoles", "Jueves", "Viernes"};
    private List<String> days;

    public Week() {
        days = new ArrayList<>();
        
        for(int x=0; x<list.length; x++){
            System.out.println(list[x]);
    } 
        
    }
    public List<String>getDays(){

        //  for (int counter = 0; counter < list.length; counter++) 
        // System.out.println(days.get(counter));        
        return days;
    }
    public void addDay() {
    
       // System.out.println(days.getList()+1);
        
    } 
    
}
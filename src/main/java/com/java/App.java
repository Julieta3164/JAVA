package com.java;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }


    public static void main(String[] args) {
        Week week = new Week();
        System.out.println(week.getDays());
    }
    
}



/*   String[] arrayString = new String[] {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
        System.out.println(arrayString.length);

        System.out.println(arrayString[2]); */
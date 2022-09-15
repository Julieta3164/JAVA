package com.java;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String[] arrayString = new String[] {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String[] arrayString.remove ("Jueves");
        

        for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
         
        System.out.println(arrayString.length);

        System.out.println(arrayString[2]);

        System.out.println(remove("Jueves"));
    }
    
}

package ejercicios_Cadenas;

import java.util.Scanner;

public class ejercicio_2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        
        System.out.println("Introduzca un nombre:");
        nombre = leer.nextLine();
        
        for (int i = 0; i < nombre.length(); i++) {
            if (i%2==0) {
                System.out.print(nombre.substring(i, i+1).toUpperCase());
            } else {
                System.out.print(nombre.substring(i, i+1).toLowerCase());
            }
        }
    }
}

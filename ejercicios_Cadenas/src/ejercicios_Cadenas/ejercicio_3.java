package ejercicios_Cadenas;

import java.util.Scanner;

public class ejercicio_3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        String vocales = "aeiou";
        int solucion = 0;
        
        System.out.println("Introduzca un nombre:");
        nombre = leer.nextLine();
        
        for (int i = 0; i < nombre.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if  ( (nombre.substring(i, i+1).equals(vocales.substring(j, j+1)) ) ) {
                    solucion++;
                }
            }
        }
        
        System.out.println(nombre + " tiene " + solucion + " vocales.");
        
    }
}

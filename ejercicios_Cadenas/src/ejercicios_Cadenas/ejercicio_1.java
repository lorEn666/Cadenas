package ejercicios_Cadenas;

import java.util.Scanner;

public class ejercicio_1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        
        System.out.println("Introduzca un nombre:");
        nombre = leer.nextLine();
        
        for (int i = nombre.length()-1; i >= 0; i--) {
            System.out.print(nombre.substring(i, i+1));
        }
        
    }
    
}

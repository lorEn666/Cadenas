package ejercicios_Cadenas;

import java.util.Scanner;

public class ejercicio_4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre = "", solucion = "";
        boolean vocalA = false, vocalE = false, vocalI = false, vocalO = false, vocalU = false;
        
        System.out.println("Introduzca un nombre:");
        nombre = leer.nextLine();
        
        nombre = (nombre.toUpperCase());
        
        for (int i = 0; i < nombre.length(); i++) {
        	
        	if ( (nombre.substring(i, i+1) ).equals("A") ) {
				vocalA = true;
			}
        	if ( (nombre.substring(i, i+1) ).equals("E") ) {
				vocalE = true;
			}
        	if ( (nombre.substring(i, i+1) ).equals("I") ) {
        		vocalI = true;
        	}
        	if ( (nombre.substring(i, i+1) ).equals("O") ) {
				vocalO = true;
			}
        	if ( (nombre.substring(i, i+1) ).equals("U") ) {
				vocalU = true;
			}
        				
		}
        
        if (vocalA == true) {
			solucion = solucion + "A";
		}
        if (vocalE == true) {
			solucion = solucion + "E";
		}
        if (vocalI == true) {
			solucion = solucion + "I";
		}
        if (vocalO == true) {
        	solucion = solucion + "O";
		}
        if (vocalU == true) {
			solucion = solucion + "U";
		}
        
        System.out.println("Su nombre contiene las vocales: " + solucion);
        
    }
    
}

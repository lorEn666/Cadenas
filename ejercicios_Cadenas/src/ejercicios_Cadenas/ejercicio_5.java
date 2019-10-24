package ejercicios_Cadenas;

import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String frase = "", solucion = "";
		
		System.out.println("Introduzca una frase:");
		frase = leer.nextLine();
		
		//Quitar espacios del principio
		/*for (int i = 0; i < frase.length(); i++) {
			if (!frase.substring(i, i+1).equalsIgnoreCase(" ") ) {
				solucion = frase.substring(i);
				break;
			}
		}*/
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (!frase.substring(i, i+1).equalsIgnoreCase(" ") ) {
				solucion = solucion + (frase.substring(i, i+1));
			} else {
				if ( (!solucion.equalsIgnoreCase("") ) && (!frase.substring(i-1, i).equalsIgnoreCase(" ") ) ) {
					solucion = solucion + (frase.substring(i, i+1) );
				}
				
			}

		}
		if (solucion.substring(solucion.length()-1, solucion.length()).equalsIgnoreCase(" ")) {
			solucion= solucion.substring(0,  solucion.length()-1);
		}
		
		
		System.out.println(solucion);
		
	}
	
}

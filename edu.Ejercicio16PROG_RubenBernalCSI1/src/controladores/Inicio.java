/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 281024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 281024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero, resultado = 0;
		Scanner sc = new Scanner(System.in);
		boolean esMenor = false;
		
		do {
			//Pido el número al usuario
			System.out.println("Introduzca un número entero: ");
			numero = sc.nextInt();
			
			//Controlo que el numero sea menor que 20
			if(numero<20) {
				esMenor = true;
			}else {
				System.err.println("El número introducido no es menor que 20...");
				esMenor = false;
			}
		}while(!esMenor);
		
		//Muestro los múltiplos menores de 100 del número introducido
		System.out.println("Los múltiplos menores de 100 del número " + numero + " son: ");
		for(int i = 0; i<=numero; i++) {
			resultado = numero * i;
			if(resultado < 100) {
				System.out.println(resultado);
			}
		}

	}

}

package org.institutoserpis.ed;

import java.util.*;

public class Adivina {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numAle = random.nextInt(1000) + 1;
		int contador = 1;
		int minimo = 1;
		int maximo = 1000;
		System.out.printf("Adivina un numero (entre %s y %s) [intento %s]:", minimo, maximo,contador);
		//System.out.println("numeroAleatorio =" + numAle);
		int numIntro = Integer.parseInt(sc.nextLine());
		while(numIntro != numAle) {
			if(numIntro < numAle) { 
				System.out.println("El numero introducido es mayor que ese");
				minimo = numIntro;
				contador++;
			} else {
				System.out.println("El numero introducido es menos que ese");
				maximo = numIntro;
				contador++;
			}
			
			System.out.printf("Adivina un numero (entre %s y %s) [intento %s]:", minimo, maximo,contador);
			numIntro = Integer.parseInt(sc.nextLine());
			
		}
		System.out.println("Enhorabuena has adivinado el numero.");
		System.out.println("Has hecho "+ contador+ " intentos");
		}
	}



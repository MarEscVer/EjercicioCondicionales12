package unico;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

//		Escribe un programa que ordene tres números enteros introducidos por teclado.
		
		int num1;
		int num2;
		int num3;
		int mayor;
		int medio;
		int menor;
		
		System.out.println("Programa para ordenar números: ");
		System.out.print("Introduzca el primer número [1 - 3]: ");
		num1 = Integer.parseInt(teclado.nextLine());
		System.out.print("Introduzca el segundo número [2 - 3]: ");
		num2 = Integer.parseInt(teclado.nextLine());
		System.out.print("Introduzca el tercer número [3 - 3]: ");
		num3 = Integer.parseInt(teclado.nextLine());

		if (num1 > num2 && num2 > num3) {
			mayor = num1;
			medio = num2;
			menor = num3;
		} else { 
			if (num1 > num2 && num3 > num2) {
				mayor = num1;
				medio = num3;
				menor = num2;
			} else {
				if (num2 > num3 && num3 > num1) {
					mayor = num2;
					medio = num3;
					menor = num1;
				} else {
					if (num2 > num3 && num1 > num3) {
						mayor = num2;
						medio = num1;
						menor = num3;
					} else {
						if (num3 > num2 && num2 > num1) {
							mayor = num3;
							medio = num2;
							menor = num1;
						} else {
							mayor = num3;
							medio = num1;
							menor = num2;						
						}
					}
				}
			}
		}
		
		System.out.println("El orden es: " + mayor + " > " + medio + " > " + menor);
	}
}

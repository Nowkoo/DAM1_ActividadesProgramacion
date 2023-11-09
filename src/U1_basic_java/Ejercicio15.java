package U1_basic_java;//Programa que lee un número entero del 1 al 10 y que muestra su valor en letra.

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number from 1 to 10:");
		number = scanner.nextInt();
		
		switch(number) {
			case 1:
			System.out.println("uno");
			break;
			case 2:
			System.out.println("dos");
			break;
			case 3:
			System.out.println("tres");
			break;
			case 4:
			System.out.println("cuatro");
			break;
			case 5:
			System.out.println("cinco");
			break;
			case 6:
			System.out.println("seis");
			break;
			case 7:
			System.out.println("siete");
			break;
			case 8:
			System.out.println("ocho");
			break;
			case 9:
			System.out.println("nueve");
			break;
			case 10:
			System.out.println("diez");
			break;
		}
	}
}
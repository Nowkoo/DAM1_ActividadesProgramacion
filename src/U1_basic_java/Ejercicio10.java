package U1_basic_java;//Diseña un algoritmo que lea un valor y muestre si es positivo o negativo (0 es positivo)

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		float number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		number = scanner.nextFloat();
		
		if(number >= 0) {
			System.out.println(number + " is positive");
		} else {
			System.out.println(number + " is negative");
		}
	}
}

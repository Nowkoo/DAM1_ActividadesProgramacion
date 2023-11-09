package U1_basic_java;//Programa que lea dos números enteros y muestre el resultado de sumarlos, restarlos, multiplicarlos y dividirlos

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int number1;
		int number2;
		int sum, sub, mult, div;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		number1 = scanner.nextInt();
		
		System.out.println("Enter number 2:");
		number2 = scanner.nextInt();
		
		sum = number1 + number2;
		sub = number1 - number2;
		mult = number1 * number2;
		div = number1/number2;
		
		System.out.println("sum: " + sum);
		System.out.println("sub: " + sub);
		System.out.println("mult: " + mult);
		System.out.println("div: " + div);
	}
}
package U1_basic_java;//Programa que lea dos números enteros y dependiendo de la operación que indique
//el usuario (+, -, * , /) muestre el resultado

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		
		int number1, number2;
		String op;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2:");
		number2 = scanner.nextInt();
		
		System.out.println("Enter the operation (+, -, * or /):");
		op = scanner.next();
		
		switch (op) {
			case "+":
			System.out.println("Sum: " + (number1 + number2));
			break;
			case "-":
			System.out.println("Sub: " + (number1 - number2));
			break;
			case "*":
			System.out.println("Mult: " + (number1 * number2));
			break;
			case "/":
			System.out.println("Div: " + (number1/number2));
			break;
		}
	}
}
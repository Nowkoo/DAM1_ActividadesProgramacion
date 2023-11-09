package U1_basic_java;//Diseña un algoritmo que lea dos valores y muestre el más grande de ellos

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		int number1, number2;
		int biggerNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2:");
		number2 = scanner.nextInt();
		
		if(number1 >= number2) {
			biggerNumber = number1;
		} else {
			biggerNumber = number2;
		}
		
		System.out.println(biggerNumber + " is the biggest number");
	}
}
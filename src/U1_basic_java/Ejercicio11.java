package U1_basic_java;//Diseña un algoritmo que lea dos valores y los muestre en orden ascendente.

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		int number1, number2;
		int min, max;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2:");
		number2 = scanner.nextInt();
		
		if(number1 >= number2){
			min = number2;
			max = number1;
		} else {
			min = number1;
			max = number2;
		}
		
		System.out.println(min + ", " + max);
	}
}
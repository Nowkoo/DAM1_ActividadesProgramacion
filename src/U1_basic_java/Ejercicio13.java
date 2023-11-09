package U1_basic_java;//Programa que lee dos valores y los ordena ascendiente o descentemente según elija el usuario

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		int number1, number2;
		int max, min;
		int order;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2:");
		number2 = scanner.nextInt();
		
		if(number1 >= number2) {
			max = number1;
			min = number2;
		} else {
			max = number2;
			min = number1;
		}
		
		System.out.println("Type 1 for ascending order or 2 for descending order");
		order = scanner.nextInt();
		
		if(order == 1){
			System.out.println(min + ", " + max);
		} else {
			System.out.println(max + ", " + min);
		}
	}
}
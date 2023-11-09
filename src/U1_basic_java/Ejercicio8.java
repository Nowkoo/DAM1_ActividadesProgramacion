package U1_basic_java;//Programa que pide la edad al usuario y muestra un mensaje si es mayor de edad

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		 
		 int age;
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter the age:");
		 age = scanner.nextInt();
		 
		 if(age >= 18){
			 System.out.println("You have the legal age");
		 }
	}
}

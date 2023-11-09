package U1_basic_java;//Programa que pida el radio de una circunferencia y muestre su área y su perímetro

import java.util.Scanner;

public class Ejercicio6 {
	public static void main (String[] args) {
		
		double radius;
		double length;
		double area;
		final double PI = 3.14159;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter de radius:");
		radius = scanner.nextFloat();
		
		length = 2 * PI * radius;
		area = PI * radius * radius;
		
		System.out.println("length: " + length);
		System.out.println("area: " + area);
	}
}
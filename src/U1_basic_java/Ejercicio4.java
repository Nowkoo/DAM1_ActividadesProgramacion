package U1_basic_java;//Programa que calcula y muestra el área de un cuadrado cuyo lado se introduce por pantalla

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		float side;
		float squareArea;
		
		System.out.println("Enter the side:");
		
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		side = inputValue.nextFloat();
		
		squareArea = side * side;
		System.out.println(squareArea);
	}
}
package U1_basic_java;

import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args){
		
		double price;
		double finalPrice;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el precio del producto: ");
		price = scanner.nextDouble();
		
		if(price < 6) {
			finalPrice = price;
		} else if(price >= 6 && price < 60) {
			finalPrice = price - ((price * 5)/100);
		} else {
			finalPrice = price - ((price * 10)/100);
		}
		
		System.out.println("El precio final es de " + finalPrice + " euros");
	}
}
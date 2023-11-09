package U1_basic_java;//Programa que pida el precio real de un producto, el precio rebajado y muestre el descuento realizado

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		float precioReal;
		float precioRebajado;
		float descuento;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el precio real:");
		precioReal = scanner.nextFloat();
		System.out.println("Introduzca el precio rebajado:");
		precioRebajado = scanner.nextFloat();
		
		descuento = precioReal - precioRebajado;
		
		System.out.println("descuento: " + descuento);
	}
}
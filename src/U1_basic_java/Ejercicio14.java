package U1_basic_java;//Diseña un algoritmo que lea un valor numérico entero correspondiente a la nota de un examen y
//muestre su valor en letra

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		float result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una nota del 1 al 10:");
		result = scanner.nextFloat();
		
		if(result > 10){
			return;
		}else if(result >= 9){
			System.out.println("Sobresaliente");
		}else if(result >= 7) {
			System.out.println("Notable");
		}else if(result >= 6) {
			System.out.println("Bien");
		}else if(result >= 5){
			System.out.println("Suficiente");
		}else if(result >= 3){
			System.out.println("Insuficiente");
		}else if(result >= 0){
			System.out.println("Muy Deficiente");
		}
	}
}
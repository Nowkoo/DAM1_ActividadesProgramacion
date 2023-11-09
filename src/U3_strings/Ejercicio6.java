package U3_strings;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string;
		char char1, char2;
		
		System.out.println("Introduzca una cadena: ");
		string = scanner.next();
		System.out.println("¿Qué carácter sustituiremos en la cadena? ");
		char1 = scanner.next().charAt(0);
		System.out.println("¿Por qué carácter lo sustituiremos? ");
		char2 = scanner.next().charAt(0);
		
		System.out.println("El resultado es: " + substitute(string, char1, char2));
		}
		
		public static String substitute(String s, char char1, char char2) {

		return s.replace(char1, char2);
		}
}
package U3_strings;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1, string2;
		
		System.out.println("Introduzca la primera cadena: ");
		string1 = scanner.next();
		
		System.out.println("Introduzca la segunda cadena: ");
		string2 = scanner.next();
		
		if (contains2(string1, string2))
			System.out.println(string1 + " contiene " + string2 + ".");
		else
			System.out.println(string1 + " no contiene " + string2 + ".");
		}
	
	public static boolean contains2(String s1, String s2) {

		return s1.contains(s2);
	}
}
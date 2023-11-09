package U2_3_recursive_methods;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		
		System.out.println("Introduzca el número entero a invertir: ");
		number = scanner.nextInt();
		
		System.out.println("El número invertido es: " + reverse(number));
	}
	
	static String reverse(int n) {
        if(n > 0) {
            return n % 10 + reverse(n / 10);
        }
		return "";
    }
	
	/*
	public static String reverseInt(int n) {
		String s = "" + n;
		return reverseString(s);
	}
	
	public static String reverseString(String s) {
		if((null == s) || (s.length() <= 1)) {
			return s;
		}
		return reverseString(s.substring(1)) + s.charAt(0);
	}
	*/
}
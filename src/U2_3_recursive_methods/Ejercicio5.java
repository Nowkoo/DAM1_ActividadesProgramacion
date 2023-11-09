package U2_3_recursive_methods;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		
		System.out.println("Introduzca un número entero en base 10: ");
		number = scanner.nextInt();
		
		System.out.println("El número en binario es: " + toBinary(number));
	}	
	
	public static String toBinary(int n) {
		if (n > 0)
			return toBinary(n / 2) + n % 2;
		
		return "";
	}
}
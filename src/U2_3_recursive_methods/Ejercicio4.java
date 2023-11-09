package U2_3_recursive_methods;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		String reverseNumber;
		
		System.out.println("Introduzca el número entero a invertir: ");
		number = scanner.nextInt();
		
		System.out.println("El número invertido es: " + reverse(number));
	}
	
	public static int reverse(int n) {
       int r = 0;
	   return reverse2(n, r);
    }
	
	public static int reverse2(int n, int r) {		
		if (n > 0) {
			r = r * 10 + n % 10;
			n = n / 10;
			return reverse2(n, r);
		}
		
		return r;
	}
	
	
}
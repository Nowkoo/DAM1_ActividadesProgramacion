package U2_2_value_methods;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int number1, number2;
        boolean isDivisible;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        number1 = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        number2 = scanner.nextInt();

        isDivisible = divisible(number1, number2);

        if(isDivisible) {
            System.out.println(number1 + " es divisible por " + number2 + ".");
        } else {
            System.out.println(number2 + " no es divisible por " + number2 + ".");
        }
    }

    public static boolean divisible(int n, int m) {
        if(n % m == 0) {
            return true;
        } else {
            return false;
        }
    }
}

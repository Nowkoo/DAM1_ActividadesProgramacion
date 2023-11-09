package U1_basic_java;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        int number;
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + number + " es " + factorial);
    }
}
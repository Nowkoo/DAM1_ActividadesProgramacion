package U1_basic_java;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        int number;
        boolean esPrimo = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        number = scanner.nextInt();

        if(number == 2 || number == 3 || number == 5) {
            esPrimo = true;
        } else if(number % 2 == 0) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= (number/2); i++) {
                if(i % 2 == 1) {
                    if((number % i) == 0) {
                        esPrimo = false;
                        break;
                    } else {
                        esPrimo = true;
                    }
                }
            }
        }

        if(esPrimo) {
            System.out.println("Es un número primo");
        } else {
            System.out.println("No es un número primo");
        }
    }
}

package U2_2_value_methods;

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        number = scanner.nextInt();

        esPrimo(number);
        if(esPrimo(number)) {
            System.out.println("Es un número primo");
        } else {
            System.out.println("No es un número primo");
        }
    }

    public static boolean esPrimo(int number) {
        boolean esPrimo = false;
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

        return esPrimo;
    }
}

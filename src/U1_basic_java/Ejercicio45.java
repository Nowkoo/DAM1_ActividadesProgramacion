package U1_basic_java;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {

        int number;
        char digit;
        int cociente;
        int aux;
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número en decimal (hasta 255): ");
        number = scanner.nextInt();

        cociente = number;

        while(cociente > 0) {
            aux = cociente / 2;

            if (cociente % 2 == 0) {
                digit = '0';
            } else {
                digit = '1';
            }

            cociente = aux;
            result = digit + result;
        }

        System.out.println(result);
    }
}

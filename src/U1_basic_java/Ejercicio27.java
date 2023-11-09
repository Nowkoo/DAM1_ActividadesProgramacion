package U1_basic_java;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        int number;
        String string = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        number = scanner.nextInt();

        for(int i = 1; i <= number; i++) {
            string = string + " " + i;
            System.out.println(string);
        }
    }
}

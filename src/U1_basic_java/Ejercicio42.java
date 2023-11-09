package U1_basic_java;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args){

        int number1;
        int number2;
        int mult;
        int i = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        number1 = scanner.nextInt();
        System.out.print("Introduzca el segundo número: ");
        number2 = scanner.nextInt();

        mult = number1;

        while(i < number2) {
            mult = mult + number1;
            i = i + 1;
        }

        System.out.println(number1 + " * " + number2 + " = " + mult);
    }
}

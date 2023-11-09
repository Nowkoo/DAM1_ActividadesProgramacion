package U1_basic_java;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args){

        int number;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        number = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}

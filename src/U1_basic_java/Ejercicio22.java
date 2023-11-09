package U1_basic_java;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        int number;
        int positiveAmount = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el número " + i);
            number = scanner.nextInt();

            if(number >= 0) {
                positiveAmount++;
            }
        }

        System.out.println(positiveAmount + " números son positivos");
    }
}
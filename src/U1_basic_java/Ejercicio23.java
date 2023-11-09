package U1_basic_java;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        int i = 1;
        int number;
        int positiveAmount = 0;

        Scanner scanner = new Scanner(System.in);

        while (i > 0) {
            System.out.println("Introduce el número " + i);
            number = scanner.nextInt();

            if(number == 0) {
                break;
            }

            if(number >= 0) {
                positiveAmount++;
            }

            i++;
        }

        System.out.println(positiveAmount + " números son positivos");
    }
}
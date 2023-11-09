package U1_basic_java;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args){

        int[] numbers = new int[10];
        int biggestNumber;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        biggestNumber = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(biggestNumber < numbers[i])
                biggestNumber = numbers[i];
        }

        System.out.println(biggestNumber + " es el número más grande.");
    }
}
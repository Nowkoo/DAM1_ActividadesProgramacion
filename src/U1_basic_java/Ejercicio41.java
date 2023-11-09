package U1_basic_java;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args){

        double[] numbers = new double[1000];

        numbers[0] = 0;
        numbers[1] = 1;

        Scanner scanner = new Scanner(System.in);
        int number;
        double result;

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/

        System.out.println("¿Qué posición quieres comprobar? (de 0 a 998): ");
        number = scanner.nextInt();

        if(number < numbers.length - 1) {
            result = numbers[number + 1] / numbers[number];
            System.out.println("El resultado es " + result);
        } else {
            System.out.println("El número es demasiado grande");
        }
    }
}

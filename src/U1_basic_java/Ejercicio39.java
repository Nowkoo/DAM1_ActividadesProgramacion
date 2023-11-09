package U1_basic_java;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args){

        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número natural: ");
        number = scanner.nextInt();

        System.out.println("Sus divisores son: ");

        for(int i = 1; i <= number; i++){
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }
}

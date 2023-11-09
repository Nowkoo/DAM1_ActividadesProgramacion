package U1_basic_java;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args){

        String string;
        int number;
        int result = 0;
        int potencia = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número en binario: ");
        string = scanner.next();

        for(int i = string.length(); i > 0; i--) {
           if (string.charAt(i - 1) == '0'){
               number = 0;
           } else {
               number = 1;
           }

           result = result + (number * ((int)Math.pow(2, potencia)));
           potencia++;
        }

        System.out.println(result);
    }
}

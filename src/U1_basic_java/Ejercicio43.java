package U1_basic_java;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        System.out.print("Introduzca el dividendo: ");
        dividend = scanner.nextInt();
        System.out.print("Introduzca el divisor: ");
        divisor = scanner.nextInt();

        if(dividend >= divisor){
            while(dividend >= divisor) {
                dividend = dividend - divisor;
            }
            System.out.println(dividend);
        } else {
            System.out.println("El divisor es mayor que el dividendo.");
        }
    }
}

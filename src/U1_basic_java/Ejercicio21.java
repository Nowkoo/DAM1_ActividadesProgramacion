package U1_basic_java;

import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args){

        int year;
        boolean esBisiesto;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un año:");
        year = scanner.nextInt();

        if(year % 4 != 0){
            esBisiesto = false;
        } else {
            if(year % 100 == 0 && year % 400 != 0) {
                esBisiesto = false;
            } else {
                esBisiesto = true;
            }
        }

        if(esBisiesto) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
}
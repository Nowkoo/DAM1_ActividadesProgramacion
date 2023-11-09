package U2_2_value_methods;

import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {

        double base;
        int exponent;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la base de la potencia: ");
        base = scanner.nextDouble();
        System.out.println("Introduzca el exponente de la potencia: ");
        exponent = scanner.nextInt();

        result = potencia(base, exponent);
        System.out.println(base + " elevado a " + exponent + " son: " + result);

        //potencia(base, exponent);
    }

    public static double potencia(double x, int y) {
        double result;

        if(y == 0)
            return 1;
        else{
            result = x * potencia(x, y - 1);
            return result;
        }
    }

    /*public static void potencia(double x, int y) {
        if(y >= 0) {
            potencia(x, y - 1);
            double result = x * (Math.pow(x, y));
            System.out.println(x + " elevado a " + y + " son: " + result);
        }
    }*/
}

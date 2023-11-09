package U2_3_recursive_methods;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int number1, number2, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        number1 = scanner.nextInt();
        System.out.println("¿Por qué número lo multiplicaremos?");
        number2 = scanner.nextInt();

        result = mult(number1, number2);
        System.out.println(result);
    }

    public static int mult(int n, int t) {
        int result;
        if(t == 0)
            return 0;
        else {
            result = n + mult(n, t - 1);
            return result;
        }
    }
}

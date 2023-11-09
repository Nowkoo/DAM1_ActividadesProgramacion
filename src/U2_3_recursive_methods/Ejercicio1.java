package U2_3_recursive_methods;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int number, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos números sumaremos?");
        number = scanner.nextInt();

        result = sum(number);
        System.out.println("El resultado es " + result);
    }

    public static int sum(int n) {
        int result;
        if(n == 0)
            return 0;
        else {
            result = n + sum(n - 1);
            return result;
        }
    }
}

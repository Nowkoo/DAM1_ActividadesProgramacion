package U2_2_value_methods;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        boolean isTriangle;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la longitud del primer lado del triangulo: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Introduzca la longitud del segundo lado del triangulo: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Introduzca la longitud del tercer lado del triangulo: ");
        numbers[2] = scanner.nextInt();

        isTriangle = isTriangle(numbers);

        if(isTriangle) {
            System.out.println("Se puede formar un triángulo");
        } else {
            System.out.println("No se puede formar un triángulo");
        }
    }

    public static boolean isTriangle(int[] numbers) {
        boolean result = true;

        if(numbers[0] > (numbers[1] + numbers[2]))
            result = false;
        else if (numbers[1] > (numbers[0] + numbers[2]))
            result = false;
        else if (numbers[2] > (numbers[0] + numbers[1]))
            result = false;

        return result;
    }
}

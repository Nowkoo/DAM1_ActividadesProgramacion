package U1_basic_java;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args){

        int contador = 0;
        int[] array;
        int[] reverseArray;

        array = new int[10];
        reverseArray = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Ingrese el número " + (i + 1));
            array[i] = scanner.nextInt();
        }

        for (int a = 9; a >= 0; a--) {
            reverseArray[contador] = array[a];
            contador++;
        }

        for (int b : reverseArray) {
            System.out.println(b);
        }
    }
}

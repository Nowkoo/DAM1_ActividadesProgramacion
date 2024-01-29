package U5_POO.T06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfazUsuario {
    private static Scanner scanner = new Scanner(System.in);
    public static int inputFila() {
        System.out.println("Introduce una letra: ");
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letra = scanner.next().toUpperCase();
        if (!letras.contains(letra))
            return -10;
        return letras.indexOf(letra.charAt(0));
    }

    public static int inputColumna() {
        System.out.print("Introduce un número: ");
        return inputNumerico() - 1;
    }

    public static int inputNumerico() {
        Scanner scanner = new Scanner(System.in);
        int input;
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            input = -10;
        }
        return input;
    }

    public static boolean volverAJugar() {
        System.out.println("¿Volver a jugar? S/N");
        scanner.nextLine();
        String inputPlayer = scanner.nextLine().toUpperCase();
        if(inputPlayer.equals("S")) {
            System.out.println();
            return true;
        } else
            return false;
    }
}

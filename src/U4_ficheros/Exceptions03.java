package U4_ficheros;

import java.util.Scanner;
/**
 * Ejemplo uso de excepciones para garantizar un dato válido
 * mediante un bucle que contiene el tratamiento de excepciones.
 */
public class Exceptions03 {
    private static double leerDouble() {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escribe la cantidad:");
            try {
                double foo = inputScanner.nextDouble();
                return foo;
            }
            catch (java.util.InputMismatchException e) {
                inputScanner.nextLine();
            }
        }
    }
    public static void main(String[] args){
        double valor = leerDouble();
        System.out.println("El valor introducido es: " + valor);
    }
}

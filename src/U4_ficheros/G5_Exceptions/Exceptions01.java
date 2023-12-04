package U4_ficheros.G5_Exceptions;

import java.util.Scanner;

/**
 * Ejemplo básico 1 de uso de excepciones.
 * Ejecutamos código de forma controlada dentro del try (error de tipo de entrada)
 * En caso de error (Exception) se captura en el catch para su tratamiento.
 */
public class Exceptions01 {
    private static double leerDouble() {
        Scanner inputScanner = new Scanner(System.in);
        double valor = -1;
        try {
            System.out.println("Escribe la cantidad:");
            valor =  inputScanner.nextDouble();
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Valor incorrecto.");
            //e.printStackTrace();
        }

        return valor;
    }
    public static void main(String[] args){
        double valor = leerDouble();
        System.out.println("El valor introducido es: " + valor);
    }
}

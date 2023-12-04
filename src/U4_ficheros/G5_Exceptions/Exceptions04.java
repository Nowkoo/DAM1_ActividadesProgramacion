package U4_ficheros.G5_Exceptions;

import java.util.Scanner;
/**
 * Ejemplo de uso de excepciones para garantizar la validez de un dato de entrada
 * mediante llamada recursiva.
 * El ejemplo también muestra el uso de la cláusula finally
 */
public class Exceptions04 {
    public static void main(String[] args) {
        int num2, num1 = 10;
        Scanner myScanner = new Scanner(System.in);
        num1 = opera(num1,myScanner);
    }
    public static int opera(int a, Scanner myScanner){
        System.out.println("Divide 10 por un valor: ");
        int value=0;

        try {
            int b = myScanner.nextInt();
            value = a/b;

        }catch (Exception e){
            myScanner.nextLine();
            System.out.println(e.toString());
            value = opera(a,myScanner);
        }finally {
            System.out.println("Por aquí siempre paso...");
            System.out.println("num1 = " + value);
        }
        return value;
    }

}


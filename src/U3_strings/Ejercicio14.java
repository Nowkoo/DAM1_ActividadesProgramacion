package U3_strings;
import Librerias.Utilidades;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;

        System.out.println("Introduzca una cadena de carácteres: ");
        string = scanner.nextLine();

        System.out.println("La cadena contiene " + digitAmount(string) + " números.");
    }

    public static int digitAmount(String s) {
        char[] numeros ={'0','1','2','3','4','5','6','7','8','9'};
        String[] words = Utilidades.dividirEnPalabras(s);
        int cantidadNumeros = words.length;

        for (String word : words) {
            cantidadNumeros = esNumero(word, cantidadNumeros);
        }
        return cantidadNumeros;
    }

    public static int esNumero(String word, int cantidadNumeros) {
        for (int i = 0; i < word.length(); i++) {
            if (!esNumero(word.charAt(i))){
                cantidadNumeros--;
                break;
            }
        }
        return cantidadNumeros;
    }

    private static boolean esNumero(char c){
        String numeros = "0123456789";
        return numeros.contains(""+c);
    }
}
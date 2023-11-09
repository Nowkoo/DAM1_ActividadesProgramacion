package U3_strings;
import java.util.Scanner;
import Librerias.Utilidades;

public class Ejercicio17 {
    public static void main(String[] args) {

        String words;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena de carácteres: ");
        words = scanner.nextLine();

        siglas(words);
    }

    public static String siglas(String s) {
        String result = "";

        //Si el primer carácter es mayúscula, lo añade a la sigla.
        if(isCaps(s.charAt(0)))
            result = result + s.charAt(0);

        //Si encuentra un espacio, comprueba que el carácter de después
        // del espacio sea mayúscula. Si lo es, se añade a la sigla.
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == ' ') {
                if (isCaps(s.charAt(i)))
                    result = result + s.charAt(i);
            }
        }
        System.out.println(result);
        return result;
    }

    private static boolean isCaps(char c){
        String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return caps.contains(""+c);
    }
}
package U3_strings;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;

        System.out.println("Introduzca una cadena de carácteres: ");
        string = scanner.nextLine();

        System.out.println("La cadena contiene " + digitAmount(string) + " dígitos.");
    }

    public static int digitAmount(String s) {
        int count = 0;
        char[] numeros ={'0','1','2','3','4','5','6','7','8','9'};

        for(int i = 0; i < s.length() ;i++){
            for(int j = 0; j < numeros.length;j++){
                if (s.charAt(i)== numeros[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

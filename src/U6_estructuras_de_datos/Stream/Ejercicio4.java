package U6_estructuras_de_datos.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> entradas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Introduce una palabra: ");
            input = scanner.nextLine();
            if (input.length() != 0) {
                entradas.add(input);
            }
        } while(input.length() != 0);

        entradas.stream()
                .forEach(cadena -> System.out.println(cadena));
    }
}
package U6_estructuras_de_datos.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> entradas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("Introduce un número: ");
            input = scanner.nextInt();
            if (input > 0) {
                entradas.add(input);
            }
        } while(input > 0);

        entradas.stream()
                .forEach(numero -> System.out.println(numero));
    }
}

package U6_estructuras_de_datos.ArrayList.Ej1_Coches;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Coche> coches;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        coches = new ArrayList<>();
        String input;
        do {
            System.out.println("Añade un coche: ");
            input = scanner.nextLine();
            if(input.length() != 0) {
                coches.add(new Coche(input));
            }
        } while (input.length() != 0);
    }
}

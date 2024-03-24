package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio3;

import U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio1.ListaDeTareas;
import U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio1.Tarea;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio3 {
    private static ArrayList<KidsList> casosDePrueba = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        int i = 1;
        do {
            System.out.println("Caso de prueba " + i);
            System.out.println("¿Cuántos niños hay en la lista?");
            input = pedirInput(0, 100000);
            if (input != 0) crearLista(input);
            i++;
        } while (input != 0);

        salida();
    }

    public static void crearLista(int longitud) {
        KidsList kidsList = new KidsList();
        casosDePrueba.add(kidsList);
        for (int i = 0; i < longitud; i++) {
            System.out.println("Comportamiento del niño " + (i + 1) + ": ");
            int comportamiento = pedirInput(1, 100);
            System.out.println("Peso de los regalos del niño " + (i + 1) + ": ");
            int pesoRegalos = pedirInput(1, 1000);
            kidsList.newKid(comportamiento, pesoRegalos);
        }
    }

    public static int pedirInput(int min, int max) {
        while(true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input >= min && input <= max) {
                    return input;
                }
            } else {
                System.out.println("Por favor, introduce un número.");
                scanner.next();
            }
        }
    }

    public static void salida() {
        for (KidsList lista : casosDePrueba) {
            imprimirLista(lista);
            System.out.println();
        }
    }

    public static void imprimirLista(KidsList kidsList) {
        Comparator<Kid> kidsComparator = Comparator.comparing(Kid::getComportamiento).reversed()
                .thenComparing(Kid::getPesoRegalos);
        kidsList.getKids().stream()
                .sorted(kidsComparator)
                .forEach(t -> System.out.println(t.getComportamiento() + " " + t.getPesoRegalos()));
    }
}

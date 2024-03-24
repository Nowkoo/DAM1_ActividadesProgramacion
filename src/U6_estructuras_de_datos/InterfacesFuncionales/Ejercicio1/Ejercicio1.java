package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio1;

import java.util.*;

public class Ejercicio1 {
    static ArrayList<ListaDeTareas> casosDePrueba = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        int i = 1;
        do {
            System.out.println("Caso de prueba " + i);
            System.out.println("¿Cuántos elementos contiene la lista?");
            input = pedirInput(0, 100);
            if (input != 0) crearLista(input);
            i++;
        } while (input != 0);

        salida();
    }

    public static void crearLista(int longitud) {
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        casosDePrueba.add(listaDeTareas);
        for (int i = 0; i < longitud; i++) {
            System.out.println("Prioridad de la tarea " + (i + 1) + ": ");
            int prioridad = pedirInput(1, 1000);
            System.out.println("Tiempo requerido para la tarea " + (i + 1) + ": ");
            int tiempo = pedirInput(1, 1000);
            listaDeTareas.nuevaTarea(prioridad, tiempo);
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
        for (ListaDeTareas lista : casosDePrueba) {
            imprimirLista(lista);
            System.out.println("---");
        }
    }

    public static void imprimirLista(ListaDeTareas lista) {
        Comparator<Tarea> comparadorDeTareas = Comparator.comparing(Tarea::getPrioridad).reversed()
                .thenComparing(Tarea::getTiempo);
        lista.getTareas().stream()
                .sorted(comparadorDeTareas)
                .forEach(t -> System.out.println(t.getPrioridad() + " " + t.getTiempo()));
    }
}

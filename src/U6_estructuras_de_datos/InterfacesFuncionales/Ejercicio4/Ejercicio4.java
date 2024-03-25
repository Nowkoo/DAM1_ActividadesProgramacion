package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio4;

import U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio1.ListaDeTareas;
import U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio1.Tarea;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    private static ArrayList<ListaDeTesoros> casosDePrueba = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
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

        for (ListaDeTesoros lista : casosDePrueba) {
            ordenarLista(lista);
            imprimirLista(lista);
        }
    }

    public static void crearLista(int longitud) {
        ListaDeTesoros tesoros = new ListaDeTesoros();
        casosDePrueba.add(tesoros);
        for (int i = 0; i < longitud; i++) {
            System.out.println("Nombre del tesoro " + (i + 1) + ": ");
            String nombre = pedirNombre(10, tesoros);
            System.out.println("Valor del tesoro " + (i + 1) + ": ");
            int valor = pedirInput(1, 1000);
            System.out.println("Peso del tesoro " + (i + 1) + ": ");
            int peso = pedirInput(1, 1000);
            tesoros.nuevoTesoro(valor, peso, nombre);
        }
    }

    public static String pedirNombre(int maxLongitud, ListaDeTesoros tesoros) {
        String nombre;
        while(true) {
            nombre = scanner.nextLine();
            if (nombre.length() > 0 && nombre.length() < maxLongitud && !nombreRepetido(tesoros, nombre) && caracteresValidos(nombre)) {
                return nombre;
            } else if (nombre.length() >= maxLongitud){
                System.out.println("El nombre no puede tener más de " + maxLongitud + " caracteres.");
            } else if (nombreRepetido(tesoros, nombre)) {
                System.out.println("Ya hay un tesoro llamado " + nombre + " en la lista de tesoros.");
            } else {
                System.out.println(nombre + " contiene caracteres inválidos. Utiliza solo letras del alfabeto inglés.");
            }
        }
    }

    public static boolean nombreRepetido(ListaDeTesoros listaDeTesoros, String nombre) {
        for (Tesoro tesoro : listaDeTesoros.getTesoros()) {
            if (tesoro.getNombre().equals(nombre)) return true;
        }
        return false;
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

    public static boolean caracteresValidos(String nombre) {
        for (char caracter : nombre.toCharArray()) {
            if (!(caracter >= 'A' && caracter <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public static void ordenarLista(ListaDeTesoros lista) {
        Comparator<Tesoro> comparadorDeTesoros = Comparator.comparing(Tesoro::getValor).reversed()
                .thenComparing(Tesoro::getPeso);
        lista.getTesoros().stream()
                .sorted(comparadorDeTesoros);
    }

    public static void imprimirLista(ListaDeTesoros lista) {
        String resultado = "";
        for (Tesoro tesoro : lista.getTesoros()) {
            resultado += tesoro.getNombre() + " ";
        }
        System.out.println(resultado);
    }
}

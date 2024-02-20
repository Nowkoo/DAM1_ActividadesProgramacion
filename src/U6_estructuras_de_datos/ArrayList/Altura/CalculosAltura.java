package U6_estructuras_de_datos.ArrayList.Altura;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculosAltura {
    static Scanner scanner = new Scanner(System.in);

    public static int numeroAlumnos() {
        System.out.println("Introduce el número de alumnos de la clase: ");
        return scanner.nextInt();
    }

    public static void leerAlturas(ArrayList<Double> alturas, int numAlumnos ) {
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Introduce la altura del alumno " + (i + 1));
            alturas.add(scanner.nextDouble());
        }
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double sumaAlturas = 0;
        for (double altura : alturas) {
            sumaAlturas += altura;
        }
        return sumaAlturas / alturas.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas) {
        int contador = 0;
        double media = calcularMedia(alturas);
        for (double altura : alturas) {
            if (altura > media)
                contador++;
        }
        return contador;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas) {
        int contador = 0;
        double media = calcularMedia(alturas);
        for (double altura : alturas) {
            if (altura < media)
                contador++;
        }
        return contador;
    }

    public static void mostrarResultados(ArrayList<Double> alturas) {
        for (double altura : alturas) {
            System.out.println(altura);
        }
        System.out.println("Número de alumnos con una altura superior a la media: " + calcularAlumnosAlturaSuperior(alturas));
        System.out.println("Número de alumnos con una altura inferior a la media: " + calcularAlumnosAlturaInferior(alturas));
    }
}

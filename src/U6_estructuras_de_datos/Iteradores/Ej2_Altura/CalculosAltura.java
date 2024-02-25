package U6_estructuras_de_datos.Iteradores.Ej2_Altura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CalculosAltura {
    static Scanner scanner = new Scanner(System.in);

    public static int numeroAlumnos() {
        System.out.println("Introduce el número de alumnos de la clase: ");
        return scanner.nextInt();
    }

    public static void leerAlturas(ArrayList<Double> alturas, int numAlumnos ) {
        //No conviene transformar este bucle a iterator porque utilizo el iterador
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Introduce la altura del alumno " + (i + 1));
            alturas.add(scanner.nextDouble());
        }
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double sumaAlturas = 0;
        Iterator<Double> it = alturas.iterator();
        while (it.hasNext()) {
            double d = it.next();
            sumaAlturas += d;
        }
        return sumaAlturas / alturas.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas) {
        int contador = 0;
        double media = calcularMedia(alturas);
        Iterator<Double> it = alturas.iterator();
        while (it.hasNext()) {
            double d = it.next();
            if (d > media) {
                contador++;
            }
        }
        return contador;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas) {
        int contador = 0;
        double media = calcularMedia(alturas);
        Iterator<Double> it = alturas.iterator();
        while (it.hasNext()) {
            double d = it.next();
            if (d < media) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(ArrayList<Double> alturas) {
        Iterator<Double> it = alturas.iterator();
        while (it.hasNext()) {
            double d = it.next();
            System.out.println(d);
        }
        System.out.println("Número de alumnos con una altura superior a la media: " + calcularAlumnosAlturaSuperior(alturas));
        System.out.println("Número de alumnos con una altura inferior a la media: " + calcularAlumnosAlturaInferior(alturas));
    }
}

package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio2;

import U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio1.ListaDeTareas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio2 {
    static ArrayList<ListadoVentas> casosDePrueba = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        int i = 1;
        do {
            System.out.println("Caso de prueba " + i);
            System.out.println("¿Cuántas localidades se analizarán?");
            input = pedirInput(0, 100000);
            if (input != 0) crearListadoDeVentas(input);
            i++;
        } while (input != 0);

        for (ListadoVentas lista : casosDePrueba) {
            imprimirResultadoAnalisis(lista);
        }
    }

    public static void crearListadoDeVentas(int numLocalidades) {
        ListadoVentas listadoDeVentas = new ListadoVentas();
        casosDePrueba.add(listadoDeVentas);
        for (int i = 0; i < numLocalidades; i++) {
            System.out.println("Número de billetes de loteria vendidos en la localidad " + (i + 1) + ": ");
            int billetesVendidos = pedirInput(0, 1000);
            System.out.println("Cantidad de premios ganados en la localidad " + (i + 1) + ": ");
            int premiosGanados = pedirInput(0, 1000);
            listadoDeVentas.nuevaLocalidad(billetesVendidos, premiosGanados);
        }
    }

    public static void imprimirResultadoAnalisis(ListadoVentas listadoDeVentas) {
        List<Localidad> localidades = ordenarListado(listadoDeVentas);
        /*localidades.stream()
                .forEach(l -> System.out.println(l.billetesVendidos + " " + l.premiosGanados));*/
        if (esAnalisisJusto(localidades)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public static List<Localidad> ordenarListado(ListadoVentas listadoDeVentas) {
        Comparator<Localidad> comparadorDeLocalidades =
                Comparator.comparing(Localidad::getBilletesVendidos)
                        .thenComparing(Localidad::getPremiosGanados)
                        .reversed();
        return listadoDeVentas.getLocalidades().stream()
                .sorted(comparadorDeLocalidades)
                .collect(Collectors.toList());
    }

    public static boolean esAnalisisJusto(List<Localidad> localidadesOrdenadas) {
        Localidad localidadPrevia = localidadesOrdenadas.get(0);
        for (Localidad localidad : localidadesOrdenadas) {
            if (!(localidad == localidadPrevia)) {
                if (localidad.getPremiosGanados() >= localidadPrevia.getPremiosGanados()) {
                    return false;
                }
                localidadPrevia = localidad;
            }
        }
        return true;
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
}

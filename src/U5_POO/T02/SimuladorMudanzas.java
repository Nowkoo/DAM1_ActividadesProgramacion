package U5_POO.T02;

import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorMudanzas {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Inroduzca la distancia a recorrer en km: ");
        int distancia = scanner.nextInt();

        System.out.println("Introduzca el número de bultos:");
        int numBultos = scanner.nextInt();

        ArrayList<Bulto> bultos = rellenarBultos(numBultos);

        Empresa.addCamion(new Camion("12567CDV", 20, 200));
        Mudanza mudanza = new Mudanza(Empresa.getMudanzas().size() + 1, distancia, Empresa.getCamiones().get(0), bultos);
        System.out.println("El coste de la mudanza sería de " + mudanza.coste() + " euros.");
    }

    static ArrayList<Bulto> rellenarBultos(int numBultos) {
        ArrayList<Bulto> bultos = new ArrayList<>();
        for (int i = 1; i <= numBultos; i++) {
            System.out.println("BULTO " + i);
            System.out.println("Volumen del bulto: ");
            int volumen = scanner.nextInt();
            System.out.println("Peso: ");
            int peso = scanner.nextInt();
            scanner.nextLine();
            System.out.println("¿Frágil? S/N");
            bultos.add(new Bulto(i, volumen, peso, esFragil()));
        }
        return bultos;
    }

    static String esFragil() {
        String respuesta = scanner.nextLine().toUpperCase();
        if (respuesta.equals("S") | respuesta.equals("SI"))
            return "FRÁGIL";
        else if (respuesta.equals("N") | respuesta.equals("NO"))
            return "NORMAL";
        else {
            System.out.println("Respuesta inválida.");
            esFragil();
        }
        return "NORMAL";
    }
}

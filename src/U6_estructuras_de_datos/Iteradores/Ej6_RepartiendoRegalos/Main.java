package U6_estructuras_de_datos.Iteradores.Ej6_RepartiendoRegalos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RepartiendoRegalos repartidor = new RepartiendoRegalos();
        ArrayList<Integer> portales = new ArrayList<>();
        portales.add(10);
        portales.add(2);
        portales.add(6);
        ArrayList<Integer> portalesOrdenados = repartidor.consultarPortales(5, portales);
        System.out.println(portalesOrdenados);
    }
}

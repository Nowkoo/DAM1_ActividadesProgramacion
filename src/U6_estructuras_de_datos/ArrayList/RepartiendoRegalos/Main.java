package U6_estructuras_de_datos.ArrayList.RepartiendoRegalos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RepartiendoRegalos repartidor = new RepartiendoRegalos();
        ArrayList<Integer> portales = new ArrayList<>();
        portales.add(1);
        portales.add(2);
        portales.add(3);
        repartidor.consultarPortales(5, portales);
        System.out.println(portales);
    }
}

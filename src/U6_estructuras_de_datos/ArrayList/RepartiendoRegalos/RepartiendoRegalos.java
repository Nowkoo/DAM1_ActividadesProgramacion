package U6_estructuras_de_datos.ArrayList.RepartiendoRegalos;

import java.util.ArrayList;
import java.util.Arrays;

public class RepartiendoRegalos {
    public void consultarPortales(int portalAterrizaje, ArrayList<Integer> portalesPendientes) {
        ArrayList<Integer> portalesOrdenados = new ArrayList<>();
        int index = -1;
        int distanciaMinima = Integer.MAX_VALUE;
        while (!portalesPendientes.isEmpty()) {
            for (int j = 0; j < portalesPendientes.size(); j++) {
                int distanciaActual = Math.abs(portalAterrizaje - portalesPendientes.get(j));
                if (distanciaMinima > distanciaActual) {
                    distanciaMinima = distanciaActual;
                    index = j;
                }
            }
            portalesOrdenados.add(portalesPendientes.get(index));
            portalAterrizaje = portalesPendientes.get(index);
            portalesPendientes.remove(index);
        }
        System.out.println(portalesOrdenados);
    }
}

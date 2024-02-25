package U6_estructuras_de_datos.ArrayList.Ej6_RepartiendoRegalos;

import java.util.ArrayList;

public class RepartiendoRegalos {
    public ArrayList<Integer> consultarPortales(int portalAterrizaje, ArrayList<Integer> portalesPendientes) {
        ArrayList<Integer> portalesOrdenados = new ArrayList<>();
        while (!portalesPendientes.isEmpty()) {
            int index = -1;
            int distanciaMinima = Integer.MAX_VALUE;
            for (int j = 0; j < portalesPendientes.size(); j++) {
                int distanciaActual = Math.abs(portalAterrizaje - portalesPendientes.get(j));
                if (distanciaMinima > distanciaActual ||
                        (distanciaMinima == distanciaActual && portalesPendientes.get(j) > portalesPendientes.get(index))) {
                    distanciaMinima = distanciaActual;
                    index = j;
                }
            }
            portalesOrdenados.add(portalesPendientes.get(index));
            portalAterrizaje = portalesPendientes.get(index);
            portalesPendientes.remove(index);
        }
        return portalesOrdenados;
    }
}

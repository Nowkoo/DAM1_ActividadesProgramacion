package U6_estructuras_de_datos.Iteradores.Ej6_RepartiendoRegalos;

import java.util.ArrayList;
import java.util.Iterator;

public class RepartiendoRegalos {
    public ArrayList<Integer> consultarPortales(int portalAterrizaje, ArrayList<Integer> portalesPendientes) {
        ArrayList<Integer> portalesOrdenados = new ArrayList<>();
        while (!portalesPendientes.isEmpty()) {
            Iterator<Integer> it = portalesPendientes.iterator();
            Integer portalMasCercano = null;
            int distanciaMinima = Integer.MAX_VALUE;

            while (it.hasNext()) {
                int portalActual = it.next();
                int distanciaActual = Math.abs(portalAterrizaje - portalActual);
                if (distanciaActual < distanciaMinima ||
                        (distanciaActual == distanciaMinima && portalActual > portalMasCercano)) {
                    distanciaMinima = distanciaActual;
                    portalMasCercano = portalActual;
                }
            }
            portalesOrdenados.add(portalMasCercano);
            portalAterrizaje = portalMasCercano;
            portalesPendientes.remove(portalMasCercano);
        }
        return portalesOrdenados;
    }
}

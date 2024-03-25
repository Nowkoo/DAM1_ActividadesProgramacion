package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTesoros {
    private List<Tesoro> tesoros = new ArrayList<>();

    public void nuevoTesoro(int valor, int peso, String nombre) {
        tesoros.add(new Tesoro(valor, peso, nombre));
    }

    public List<Tesoro> getTesoros() {
        return tesoros;
    }
}

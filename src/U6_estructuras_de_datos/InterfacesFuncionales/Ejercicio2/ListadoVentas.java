package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio2;

import java.util.ArrayList;

public class ListadoVentas {
    ArrayList<Localidad> localidades = new ArrayList<>();

    public void nuevaLocalidad(int billetesVendidos, int premiosGanados) {
        localidades.add(new Localidad(billetesVendidos, premiosGanados));
    }

    public ArrayList<Localidad> getLocalidades() {
        return localidades;
    }
}

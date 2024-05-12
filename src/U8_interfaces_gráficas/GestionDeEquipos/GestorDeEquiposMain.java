package U8_interfaces_gráficas.GestionDeEquipos;

import U8_interfaces_gráficas.GestionDeEquipos.Controller.OperacionesBBDD;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Datos;
import U8_interfaces_gráficas.GestionDeEquipos.View.Interfaz;

public class GestorDeEquiposMain {
    private static Interfaz interfaz;
    public static void main(String[] args) {
        OperacionesBBDD.cargarDatosEquipos(Datos.getEquipos());
        OperacionesBBDD.cargarDatosJugadores(Datos.getJugadores());
        interfaz = new Interfaz();
    }
}

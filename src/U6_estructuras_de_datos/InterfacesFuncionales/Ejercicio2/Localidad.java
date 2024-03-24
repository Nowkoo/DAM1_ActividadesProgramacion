package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio2;

public class Localidad {
    private int billetesVendidos;
    private int premiosGanados;

    public Localidad(int billetesVendidos, int premiosGanados) {
        this.billetesVendidos = billetesVendidos;
        this.premiosGanados = premiosGanados;
    }

    public int getBilletesVendidos() {
        return billetesVendidos;
    }

    public int getPremiosGanados() {
        return premiosGanados;
    }
}

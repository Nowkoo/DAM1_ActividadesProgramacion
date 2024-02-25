package U6_estructuras_de_datos.ArrayList.Ej2_Altura;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CalculosAltura calculosAltura = new CalculosAltura();
        int numAlumnos = calculosAltura.numeroAlumnos();
        ArrayList<Double> alturas = new ArrayList<>();
        calculosAltura.leerAlturas(alturas, numAlumnos);
        calculosAltura.mostrarResultados(alturas);
    }
}

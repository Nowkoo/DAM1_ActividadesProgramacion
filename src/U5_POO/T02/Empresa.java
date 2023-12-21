package U5_POO.T02;

import java.util.ArrayList;

public class Empresa {
    private static ArrayList<Camion> camiones = new ArrayList<>();
    private static ArrayList<Mudanza> mudanzas = new ArrayList<>();

    public static void addCamion(Camion camion) {
        camiones.add(camion);
    }

    public static ArrayList<Camion> getCamiones() {
        return camiones;
    }

    public static void setCamiones(ArrayList<Camion> camiones) {
        Empresa.camiones = camiones;
    }

    public static ArrayList<Mudanza> getMudanzas() {
        return mudanzas;
    }

    public static void setMudanzas(ArrayList<Mudanza> mudanzas) {
        Empresa.mudanzas = mudanzas;
    }
}

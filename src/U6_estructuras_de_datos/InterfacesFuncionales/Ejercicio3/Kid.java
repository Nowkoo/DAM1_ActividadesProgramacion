package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio3;

public class Kid {
    private int comportamiento;
    private int pesoRegalos;

    public Kid(int comportamiento, int pesoRegalos) {
        this.comportamiento = comportamiento;
        this.pesoRegalos = pesoRegalos;
    }

    public int getComportamiento() {
        return comportamiento;
    }

    public int getPesoRegalos() {
        return pesoRegalos;
    }
}

package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio1;

public class Tarea {
    int prioridad;
    int tiempo;

    public Tarea(int prioridad, int tiempo) {
        this.prioridad = prioridad;
        this.tiempo = tiempo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getTiempo() {
        return tiempo;
    }
}

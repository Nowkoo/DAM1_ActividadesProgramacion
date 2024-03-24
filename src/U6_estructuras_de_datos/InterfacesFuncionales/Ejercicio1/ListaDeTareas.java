package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio1;

import java.util.ArrayList;

public class ListaDeTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public void nuevaTarea(int prioridad, int tiempo) {
        tareas.add(new Tarea(prioridad, tiempo));
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
}

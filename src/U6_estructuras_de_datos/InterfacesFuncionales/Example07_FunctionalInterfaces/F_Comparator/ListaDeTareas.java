package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.F_Comparator;

import java.util.ArrayList;

public class ListaDeTareas {
    ArrayList<Tarea> tareas = new ArrayList<>();

    public void nuevaTarea(int prioridad, int tiempo) {
        tareas.add(new Tarea(prioridad, tiempo));
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
}

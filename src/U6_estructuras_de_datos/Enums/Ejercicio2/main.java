package U6_estructuras_de_datos.Enums.Ejercicio2;

public class main {
    public static void main(String[] args) {
        Prioridad prioridad = Prioridad.ALTA;
        mensajeSegunPrioridad(prioridad);
    }

    public static void mensajeSegunPrioridad(Prioridad prioridad) {
        switch (prioridad) {
            case ALTA:
                System.out.println("Prioridad alta");
                break;
            case MEDIA:
                System.out.println("Prioridad media");
                break;
            case BAJA:
                System.out.println("Prioridad baja");
        }
    }
}

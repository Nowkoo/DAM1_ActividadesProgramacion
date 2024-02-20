package U6_estructuras_de_datos.Enums.Ejercicio1;

public enum DiaDeLaSemana {
    lunes, martes, miercoles, jueves, viernes, sabado, domingo;

    public static void mensajeDia(DiaDeLaSemana dia) {
        switch (dia) {
            case lunes:
                System.out.println("Hoy es lunes");
                break;
            case martes:
                System.out.println("Hoy es martes");
                break;
            case miercoles:
                System.out.println("Hoy es miércoles");
                break;
            case jueves:
                System.out.println("Hoy es jueves");
                break;
            case viernes:
                System.out.println("Hoy es viernes");
                break;
            case sabado:
                System.out.println("Hoy es sábado");
                break;
            case domingo:
                System.out.println("Hoy es domingo");
                break;
        }
    }
}

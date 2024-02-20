package U6_estructuras_de_datos.Enums.Ejercicio1;

public class main {
    public static void main(String[] args) {
        DiaDeLaSemana l = DiaDeLaSemana.lunes;
        DiaDeLaSemana.mensajeDia(l);

        DiaDeLaSemana m = DiaDeLaSemana.valueOf("martes");
        DiaDeLaSemana.mensajeDia(m);

        DiaDeLaSemana.mensajeDia(DiaDeLaSemana.miercoles);

        l = DiaDeLaSemana.jueves;
        DiaDeLaSemana.mensajeDia(l);

        DiaDeLaSemana.mensajeDia(DiaDeLaSemana.viernes);

        DiaDeLaSemana.mensajeDia(DiaDeLaSemana.sabado);

        DiaDeLaSemana.mensajeDia(DiaDeLaSemana.domingo);
    }
}

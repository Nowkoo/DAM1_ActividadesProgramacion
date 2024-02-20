package U6_estructuras_de_datos.Enums.Ejercicio2;

public enum Prioridad {
    ALTA(3), MEDIA(2), BAJA(1);
    int valor;

    Prioridad(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

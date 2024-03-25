package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio4;

public class Tesoro {
    private int valor;
    private float peso;
    private String nombre;

    public Tesoro(int valor, int peso, String nombre) {
        this.valor = valor;
        this.peso = peso;
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }
}

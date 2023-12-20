package U5_POO.T02;

public class Bulto {
    private int id;
    private int volumen;
    private int peso;
    private String tipo;

    Bulto(int id, int volumen, int peso, String tipo) {
        this.id = id;
        this.volumen = volumen;
        this.peso = peso;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

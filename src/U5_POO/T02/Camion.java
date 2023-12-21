package U5_POO.T02;

public class Camion {
    final private String matricula;
    private int volumen;
    private int peso;

    public Camion(String matricula, int volumen, int peso) {
        this.matricula = matricula;
        this.volumen = volumen;
        this.peso = peso;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

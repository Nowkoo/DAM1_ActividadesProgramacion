package U5_POO.T08.Character.Stat;

public class StatsKit {
    Fuerza fuerza;
    Constitucion constitucion;
    Inteligencia inteligencia;
    Destreza destreza;

    public StatsKit(int valorBase) {
        this.fuerza = new Fuerza(valorBase);
        this.constitucion = new Constitucion(valorBase);
        this.inteligencia = new Inteligencia(valorBase);
        this.destreza = new Destreza(valorBase);
    }

    public StatsKit(int fuerza, int constitucion, int inteligencia, int destreza) {
        this.fuerza = new Fuerza(fuerza);
        this.constitucion = new Constitucion(constitucion);
        this.inteligencia = new Inteligencia(inteligencia);
        this.destreza = new Destreza(destreza);
    }

    public Fuerza getFuerza() {
        return fuerza;
    }

    public Constitucion getConstitucion() {
        return constitucion;
    }

    public Inteligencia getInteligencia() {
        return inteligencia;
    }

    public Destreza getDestreza() {
        return destreza;
    }

    public void setFuerza(Fuerza fuerza) {
        this.fuerza = fuerza;
    }

    public void setConstitucion(Constitucion constitucion) {
        this.constitucion = constitucion;
    }

    public void setInteligencia(Inteligencia inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setDestreza(Destreza destreza) {
        this.destreza = destreza;
    }
}

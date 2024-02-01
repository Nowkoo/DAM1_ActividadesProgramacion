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
}

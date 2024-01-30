package U5_POO.T08.Character.Race;

import U5_POO.T08.Character.Stat.*;

import java.io.Console;

public class Orco extends Race {
    private static int modFuerza = 5;
    private static int modConstitucion = 3;
    private static int modInteligencia = -3;
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Fuerza) {
            return modFuerza;
        } else if (stat instanceof Constitucion) {
            return modConstitucion;
        } else if (stat instanceof Inteligencia) {
            return modInteligencia;
        }
        return 0;
    }
}

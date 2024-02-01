package U5_POO.T08.Character.Race;

import U5_POO.T08.Character.Stat.*;

public class Enano extends Race {
    private static int modInteligencia = -1;
    private static int modConstitucion = 3;
    private static int modFuerza = 3;

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Inteligencia) {
            return modInteligencia;
        } else if (stat instanceof Fuerza) {
            return modFuerza;
        } else if (stat instanceof Constitucion) {
            return modConstitucion;
        }
        return 0;
    }
}

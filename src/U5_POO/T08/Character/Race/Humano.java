package U5_POO.T08.Character.Race;

import U5_POO.T08.Character.Stat.*;

public class Humano extends Race {
    private static int modFuerza = 2;
    private static  int modConstitucion = 2;
    private static int modDestreza = 1;
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Fuerza) {
            return modFuerza;
        } else if (stat instanceof Constitucion) {
            return modConstitucion;
        } else if (stat instanceof Destreza) {
            return modDestreza;
        }
        return 0;
    }
}

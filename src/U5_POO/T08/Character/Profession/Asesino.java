package U5_POO.T08.Character.Profession;

import U5_POO.T08.Character.Stat.*;

public class Asesino extends Profession {
    private static int modDestreza = 3;
    private static int modFuerza = 1;
    private static int modConstitucion = 1;

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Destreza) {
            return modDestreza;
        } else if (stat instanceof Fuerza) {
            return modFuerza;
        } else if (stat instanceof Constitucion) {
            return modConstitucion;
        }
        return 0;
    }
}

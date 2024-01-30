package U5_POO.T08.Character.Profession;

import U5_POO.T08.Character.Stat.*;

public class Warrior extends Profession {
    private static int modFuerza = 3;
    private static int modConstitucion = 2;

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Fuerza) {
            return modFuerza;
        } else if (stat instanceof Constitucion) {
            return modConstitucion;
        }
        return 0;
    }
}

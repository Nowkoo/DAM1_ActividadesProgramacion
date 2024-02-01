package U5_POO.T08.Character.Race;

import U5_POO.T08.Character.Stat.Constitucion;
import U5_POO.T08.Character.Stat.Destreza;
import U5_POO.T08.Character.Stat.Fuerza;
import U5_POO.T08.Character.Stat.Stat;

public class Goblin {
    private static int modDestreza = 4;
    private static int modConstitucion = 1;

    public int modifier(Stat stat) {
        if (stat instanceof Destreza) {
            return modDestreza;
        } else if (stat instanceof Constitucion) {
            return modConstitucion;
        }
        return 0;
    }
}

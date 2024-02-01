package U5_POO.T08.Character.Profession;

import U5_POO.T08.Character.Stat.*;

public class Paladin extends Profession {
    private static int modConstitucion = 5;
    private static int modFuerza = 2;
    private static int modDestreza = -1;
    private static int modInteligencia = -1;

    public int modifier(Stat stat) {
        if (stat instanceof Destreza) {
            return modDestreza;
        } else if (stat instanceof Fuerza) {
            return modFuerza;
        } else if (stat instanceof Constitucion) {
            return modConstitucion;
        } else if (stat instanceof Inteligencia) {
            return modInteligencia;
        }
        return 0;
    }
}

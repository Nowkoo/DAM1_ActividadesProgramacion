package U5_POO.T08.Character.Race;

import U5_POO.T08.Character.Stat.*;

public class Elfo extends Race {
    private static int modDestreza = 3;
    private static int modInteligencia = 3;
    private static int modConstitucion = -1;

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Destreza) {
            return modDestreza;
        } else if (stat instanceof Inteligencia) {
            return modInteligencia;
        } else if (stat instanceof Constitucion) {
            return modConstitucion;
        }
        return 0;
    }
}

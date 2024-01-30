package U5_POO.T08.Character.Profession;

import U5_POO.T08.Character.Stat.*;

import javax.swing.text.DefaultStyledDocument;

public class Mago extends Profession {
    private static int modInteligencia = 4;
    private static int modDestreza = 1;

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Inteligencia) {
            return modInteligencia;
        } else if (stat instanceof Destreza) {
            return modDestreza;
        }
        return 0;
    }
}

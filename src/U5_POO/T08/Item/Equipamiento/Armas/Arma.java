package U5_POO.T08.Item.Equipamiento.Armas;

import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.ItemEquipable;

public class Arma extends ItemEquipable {
    boolean unaMano;

    public Arma(StatsKit itemStats, String nombre, boolean unaMano) {
        super(itemStats, nombre);
        this.unaMano = unaMano;
    }
}

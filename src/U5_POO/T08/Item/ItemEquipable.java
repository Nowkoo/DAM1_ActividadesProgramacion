package U5_POO.T08.Item;

import U5_POO.T08.Character.Stat.Stat;
import U5_POO.T08.Character.Stat.StatsKit;

public abstract class ItemEquipable {
    protected StatsKit itemStats = new StatsKit(0);
    protected String nombre;
    public ItemEquipable(StatsKit itemStats, String nombre) {
        this.itemStats = itemStats;
        this.nombre = nombre;
    }
}

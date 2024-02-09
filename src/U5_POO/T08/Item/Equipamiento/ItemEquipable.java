package U5_POO.T08.Item.Equipamiento;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;

public abstract class ItemEquipable {
    protected StatsKit itemStats;
    protected String nombre;
    public ItemEquipable(StatsKit itemStats, String nombre) {
        this.itemStats = itemStats;
        this.nombre = nombre;
    }

    public ItemEquipable() {
        this.itemStats = new StatsKit(0);
        this.nombre = "Vacío";
    }

    public abstract void equipar(Personaje personaje);

    public StatsKit getItemStats() {
        return itemStats;
    }

    public void setItemStats(StatsKit itemStats) {
        this.itemStats = itemStats;
    }
}

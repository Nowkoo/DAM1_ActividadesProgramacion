package U5_POO.T08.Item.Equipables;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.Item;

public abstract class ItemEquipable extends Item {
    protected StatsKit itemStats;
    public ItemEquipable(StatsKit itemStats, String name) {
        this.itemStats = itemStats;
        this.name = name;
    }

    public ItemEquipable() {
        this.itemStats = new StatsKit(0);
        this.name = "Vacío";
    }

    public abstract void equipar(Personaje personaje);

    public StatsKit getItemStats() {
        return itemStats;
    }

    public void setItemStats(StatsKit itemStats) {
        this.itemStats = itemStats;
    }
}

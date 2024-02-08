package U5_POO.T08.Item.Equipamiento.Casco;

import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.ItemEquipable;

public class CascoCuero extends ItemEquipable {
    public CascoCuero() {
        super(new StatsKit(0, 2, 0, 0), "Casco de cuero");
    }
}

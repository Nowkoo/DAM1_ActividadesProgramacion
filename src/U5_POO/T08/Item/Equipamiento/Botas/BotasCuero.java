package U5_POO.T08.Item.Equipamiento.Botas;

import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.ItemEquipable;

public class BotasCuero extends ItemEquipable {
    public BotasCuero() {
        super(new StatsKit(0, 2, 0, 0), "Botas de cuero");
    }
}

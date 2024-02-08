package U5_POO.T08.Item.Equipamiento.Guantes;

import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.ItemEquipable;

public class GuantesCuero extends ItemEquipable {
    public GuantesCuero() {
        super(new StatsKit(0, 1, 0, 0), "Guantes de cuero");
    }
}

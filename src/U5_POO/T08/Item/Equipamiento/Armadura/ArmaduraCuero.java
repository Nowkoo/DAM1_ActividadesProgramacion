package U5_POO.T08.Item.Equipamiento.Armadura;

import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.ItemEquipable;

public class ArmaduraCuero extends ItemEquipable {
    public ArmaduraCuero() {
        super(new StatsKit(0, 4, 0, 0), "Armadura de cuero");
    }
}

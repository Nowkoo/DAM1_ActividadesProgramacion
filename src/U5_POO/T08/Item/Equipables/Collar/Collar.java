package U5_POO.T08.Item.Equipables.Collar;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Character.Equipamiento;
import U5_POO.T08.Item.Equipables.ItemEquipable;

public class Collar extends ItemEquipable {
    public Collar(StatsKit itemStats, String name) {
        super(itemStats, name);
        this.peso = 5;
    }
    public Collar() {
        super(new StatsKit(0), "Vacío");
        this.peso = 5;
    }

    @Override
    public void equipar(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setCollar(this);
    }
}

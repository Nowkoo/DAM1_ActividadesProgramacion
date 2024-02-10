package U5_POO.T08.Item.Equipables.Guantes;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Character.Equipamiento;
import U5_POO.T08.Item.Equipables.ItemEquipable;

public class Guantes extends ItemEquipable {
    public Guantes(StatsKit itemStats, String name) {
        super(itemStats, name);
        this.peso = 5;
    }
    public Guantes() {
        this.itemStats = new StatsKit(0);
        this.name = "Vacío";
        this.peso = 5;
    }

    @Override
    public void equipar(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setGuantes(this);
    }
}

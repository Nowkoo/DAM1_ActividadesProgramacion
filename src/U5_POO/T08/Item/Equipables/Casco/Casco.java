package U5_POO.T08.Item.Equipables.Casco;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Character.Equipamiento;
import U5_POO.T08.Item.Equipables.ItemEquipable;

public class Casco extends ItemEquipable {
    public Casco(StatsKit itemStats, String name) {
        super(itemStats, name);
        this.peso = 10;
    }
    public Casco() {
        this.itemStats = new StatsKit(0);
        this.name = "Vacío";
        this.peso = 10;
    }

    @Override
    public void equipar(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setCasco(this);
    }
}

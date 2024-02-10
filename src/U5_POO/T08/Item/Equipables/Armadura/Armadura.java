package U5_POO.T08.Item.Equipables.Armadura;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Character.Equipamiento;
import U5_POO.T08.Item.Equipables.ItemEquipable;

public class Armadura extends ItemEquipable {
    public Armadura(StatsKit itemStats, String nombre) {
        super(itemStats, nombre);
        this.peso = 30;
    }

    public Armadura() {
        this.itemStats = new StatsKit(0);
        this.name = "Vacío";
        this.peso = 30;
    }

    @Override
    public void equipar(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setArmadura(this);
    }
}

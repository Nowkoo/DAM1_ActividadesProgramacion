package U5_POO.T08.Item.Equipamiento.Armadura;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.Equipamiento.Equipamiento;
import U5_POO.T08.Item.Equipamiento.ItemEquipable;

public class Armadura extends ItemEquipable {
    public Armadura(StatsKit itemStats, String nombre) {
        super(itemStats, nombre);
    }

    public Armadura() {
        this.itemStats = new StatsKit(0);
        this.nombre = "Vacío";
    }

    @Override
    public void equipar(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setArmadura(this);
    }
}

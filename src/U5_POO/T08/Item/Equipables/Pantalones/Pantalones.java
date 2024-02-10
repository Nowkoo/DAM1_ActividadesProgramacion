package U5_POO.T08.Item.Equipables.Pantalones;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Character.Equipamiento;
import U5_POO.T08.Item.Equipables.ItemEquipable;

public class Pantalones extends ItemEquipable {
    public Pantalones(StatsKit itemStats, String name) {
        super(itemStats, name);
        this.peso = 15;
    }
    public Pantalones() {
        this.itemStats = new StatsKit(0);
        this.name = "Vacío";
        this.peso = 15;
    }

    @Override
    public void equipar(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setPantalones(this);
    }
}

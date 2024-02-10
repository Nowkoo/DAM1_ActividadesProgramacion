package U5_POO.T08.Item.Equipables.Brazalete;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Character.Equipamiento;
import U5_POO.T08.Item.Equipables.ItemEquipable;

public class Brazalete extends ItemEquipable {
    public Brazalete(StatsKit itemStats, String nombre) {
        super(itemStats, nombre);
        this.peso = 5;
    }
    public Brazalete() {
        this.itemStats = new StatsKit(0);
        this.name = "Vacío";
        this.peso = 5;
    }

    @Override
    public void equipar(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setBrazalete(this);
    }
}

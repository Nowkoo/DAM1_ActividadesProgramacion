package U5_POO.T08.Item.Equipables.Botas;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Character.Equipamiento;
import U5_POO.T08.Item.Equipables.ItemEquipable;

public class Botas extends ItemEquipable {
    public Botas(StatsKit itemStats, String nombre) {
        super(itemStats, nombre);
        this.peso = 10;
    }

    public Botas() {
        this.itemStats = new StatsKit(0);
        this.name = "Vacío";
        this.peso = 10;
    }

    @Override
    public void equipar(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setBotas(this);
    }
}

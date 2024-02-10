package U5_POO.T08.Item.Equipables.Armas;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Character.Equipamiento;
import U5_POO.T08.Item.Equipables.ItemEquipable;

public class Arma extends ItemEquipable {
    boolean unaMano;

    public Arma(StatsKit itemStats, String nombre, boolean unaMano) {
        super(itemStats, nombre);
        this.unaMano = unaMano;
        this.peso = 10;
    }

    public Arma() {
        this.itemStats = new StatsKit(0);
        this.name = "Vacío";
        unaMano = true;
        this.peso = 10;
    }

    @Override
    public void equipar(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setArmaPrincipal(this);
        desequiparArmasIncompatibles(equipamiento.getArmaSecundaria());
    }

    public void equiparSecundaria(Personaje personaje) {
        Equipamiento equipamiento = personaje.getEquipamiento();
        equipamiento.setArmaSecundaria(this);
        desequiparArmasIncompatibles(equipamiento.getArmaPrincipal());
    }

    public void desequiparArmasIncompatibles(Arma otraArma) {
        if (!otraArma.isUnaMano() || !this.unaMano) {
            otraArma = new Arma();
        }
    }

    public boolean isUnaMano() {
        return unaMano;
    }
}

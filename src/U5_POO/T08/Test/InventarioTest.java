package U5_POO.T08.Test;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Race.Humano;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.Equipables.Armadura.Armadura;
import U5_POO.T08.Item.Equipables.Collar.Collar;
import U5_POO.T08.Item.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void add() {
        Personaje pj = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(0));
        Collar collar = new Collar();
        pj.getInv().add(collar);
        Armadura arm = new Armadura(new StatsKit(2), "Armadura de cuero");
        pj.getInv().add(arm);
        for (Item item : pj.getInv().getItems()) {
            System.out.println(item.getName());
        }
        System.out.println(pj.getInv().calcularPeso());
        pj.getInv().remove(arm);
        System.out.println(pj.getInv().calcularPeso());
    }

    @Test
    void remove() {
    }
}
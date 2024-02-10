package U5_POO.T08.Test;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Race.Humano;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.Equipables.Armadura.Armadura;
import U5_POO.T08.Item.Equipables.Collar.Collar;
import U5_POO.T08.Character.Equipamiento;
import org.junit.jupiter.api.Test;

class EquipamientoTest {

    @Test
    void statsEquipamiento() {
        Equipamiento equipPrueba = new Equipamiento();
        Collar collar = new Collar(new StatsKit(10), "Collar");
        Armadura armadura = new Armadura(new StatsKit(20), "Armadura");
        Personaje pj = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(0));
        System.out.println(pj.toString());
        collar.equipar(pj);
        System.out.println(pj.toString());
        armadura.equipar(pj);
        System.out.println(pj.toString());
    }

    @Test
    void modifier() {
    }
}
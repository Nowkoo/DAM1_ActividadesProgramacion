package U5_POO.T08.Test;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Race.Humano;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.Food.Manzana;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    @Test
    void consumedBy() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        Manzana manzana = new Manzana();
        personaje.receivesDamage(5);
        manzana.consumedBy(personaje);
        personaje.health();
        assertEquals(275,personaje.health());
    }
}
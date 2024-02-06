package U5_POO.T08.Test;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Race.Humano;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.Consumible;
import U5_POO.T08.Item.Food.ConMejora;
import U5_POO.T08.Item.Food.ConVeneno;
import U5_POO.T08.Item.Food.Manzana;
import U5_POO.T08.Item.Food.SimpleFood;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleFoodTest {

    @Test
    void consumedBy() {
        SimpleFood manzana = new Manzana();
        Consumible envenenado = new ConVeneno(manzana);
        //envenenado = new ConMejora(manzana);
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        //personaje.consumes(manzana);
        envenenado.consumedBy(personaje);
        System.out.println(personaje.health());
    }

    @Test
    void getPower() {
    }
}
package U5_POO.T08.Test;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Race.Humano;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.Consumible;
import U5_POO.T08.Item.Food.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    @Test
    void consumedBy() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        Food manzana = new Manzana();
        Consumible envenenada = new PoisonousFoodDecorator(manzana);
        envenenada = new EnhancedFoodDecorator(manzana);

        double vidaInicial = personaje.health();
        personaje.consumes(envenenada);
        assertTrue(personaje.health() == vidaInicial);
    }
}
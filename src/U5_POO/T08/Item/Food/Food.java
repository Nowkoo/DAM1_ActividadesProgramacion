package U5_POO.T08.Item.Food;

import U5_POO.T08.Item.Consumible;
import U5_POO.T08.Character.Personaje;

public abstract class Food implements Consumible {
    float power;

    public void consumedBy(Personaje personaje) {
        personaje.heals(this.power);
    }
}

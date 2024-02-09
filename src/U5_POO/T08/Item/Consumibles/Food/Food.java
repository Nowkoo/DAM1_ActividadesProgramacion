package U5_POO.T08.Item.Consumibles.Food;
import U5_POO.T08.Character.Personaje;

public interface Food {
    //Pasamos el personaje para poder actuar sobre él
    void consumedBy(Personaje personaje);
    float getPower();
    String toString();
}

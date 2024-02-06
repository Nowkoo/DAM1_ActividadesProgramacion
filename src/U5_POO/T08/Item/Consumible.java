package U5_POO.T08.Item;
import U5_POO.T08.Character.Personaje;
public interface Consumible {
    //Pasamos el personaje para poder actuar sobre él
    void consumedBy(Personaje personaje);

    public float getPower();
}

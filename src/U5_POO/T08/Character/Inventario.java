package U5_POO.T08.Character;

import U5_POO.T08.Item.Item;

import java.util.ArrayList;

public class Inventario {
    final private float pesoMaximo;
    ArrayList<Item> items = new ArrayList<Item>();

    public Inventario() {
        pesoMaximo = 200;
    }

    public Inventario(float pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public float calcularPeso() {
        float peso = 0;
        for (Item item : items) {
            peso += item.getPeso();
        }
        return peso;
    }

    public void add(Item item) {
        if (item.getPeso() + this.calcularPeso() <= pesoMaximo) {
            items.add(item);
        }
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}

package U6_estructuras_de_datos.HashMap;

import java.util.*;

public class Ej5_Botin {
    public static void main(String[] args) {
        ArrayList<Integer> billetes = new ArrayList<>();
        billetes.add(2);
        billetes.add(10);
        billetes.add(20);
        billetes.add(50);
        billetes.add(200);
        billetes.add(500);
        System.out.println(billetes);
        System.out.println(repartir(2, billetes));
        //repartir(2, 10, 20, 50, 200, 500);
    }

    public static String repartir(int participantes, ArrayList<Integer> billetes) {
        Map<Integer, String> billetesRepartidos = new HashMap<>();
        Iterator<Integer> it = billetes.iterator();
        while (it.hasNext()) {
            for (int i = 0; i < participantes; i++) {
                if (!it.hasNext()) break;
                String billete = it.next().toString();
                if (billetesRepartidos.get(i) == null) {
                    billetesRepartidos.put(i, billete);
                } else {
                    billetesRepartidos.put(i, billetesRepartidos.get(i) + " " + billete);
                }
                it.remove();
            }
        }
        return billetesRepartidos.toString();
    }
}

package U6_estructuras_de_datos.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ej4_Loteria {
    public static void main(String[] args) {
        ArrayList<String> boletos = new ArrayList<>();
        boletos.add("63565");
        boletos.add("68565");
        boletos.add("68563");
        System.out.println(mejorTerminacion(boletos));
    }

    public static String mejorTerminacion(ArrayList<String> boletosDeLoteria) {
        Map<Integer, Integer> terminacionesYRepeticiones = new HashMap<>();
        for (String boleto : boletosDeLoteria) {
            Integer terminacion = Integer.parseInt("" + boleto.charAt(boleto.length() - 1));
            terminacionesYRepeticiones.put(terminacion, terminacionesYRepeticiones.getOrDefault(terminacion, 0) + 1);
        }
        return terminacionesYRepeticiones.toString();
    }
}

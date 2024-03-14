package U06.Ejemplos.Example06_Streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Una función Lambda (función literal) es una función anónima, es decir, que no está asociada a un identificador.
 * Habitualmente las funciones Lambda son argumentos de una función de orden superior que es específico de ese uso
 * y no va a ser reutilizado.
 * El uso de funciones Lambda es una cuestión de estilo de programación, ya que cualquier función Lambda puede ser
 * reemplazada por una función estándar.
 * Las funciones Lambda se utilizan frecuentemente para implementar la funcionalidad concreta de algún tipo de
 * interfaz funcional.
 * Las funciones Lambda pueden ser expresadas de dos formas:
 *  - Como una expresión simple.
 *  - Como un bloque de instrucciones.
 */
public class B_LambdaFunctions {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(25);
        numeros.add(-20);
        numeros.add(31);
        numeros.add(13);

        // Ejemplo de Lambda de expresión
        Long pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .count();
        System.out.println("Valores pares:" + pares);

        // Ejemplo de función Lambda de bloque de instrucciones.
        Long impares = numeros.stream()
                .filter(numero -> {
                    boolean valor=numero % 2 != 0;
                    return valor;
                })
                .count();
        System.out.println("Valores impares:" + impares);

        Long mayoresDeCinco = numeros.stream()
                .filter(numero -> mayorDeCinco(numero))
                .count();
        System.out.println("Valores mayores de cinco:" + mayoresDeCinco);

        Long positivos = numeros.stream()
                .filter(numero -> positivos(numero))
                .count();
        System.out.println("Valores positivos:" + positivos);

    }
    public static boolean positivos(int numero){
        return (numero > 0);
    }

    public static boolean mayorDeCinco(int numero) {
        return numero > 5;
    }

}

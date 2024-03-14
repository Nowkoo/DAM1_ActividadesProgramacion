package U06.Ejemplos.Example06_Streams;

import java.util.ArrayList;
import java.util.List;

/**
 * La programación de flujos (Streams) en Java es una muestra de la incorporación de la programación funcional (FP)
 * en Java a partir de la versión 8.
 * FP es un paradigma de programación imperativa, algunas de sus características son:
 *  - Se centra en indicar que acciones hay que realizar.
 *  - Trabajamos principalmente con funciones que pueden ser tratadas como "variables". Estas pueden ser usadas como
 *  entrada (parámetros) y salida de otras funciones.
 *  - Los datos de trabajo no son mutables. Siempre se trabaja sobre copias de los datos originales.
 */
public class A_Statistics{
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        //Carga de datos
        numeros.add("25");
        numeros.add("30");
        numeros.add("20");

        progClasica(numeros);
        progFuncional(numeros);
    }
    // Ejemplo de programación clásica (paradigma declarativo). Indicamos como realizar las acciones.
    private static void progClasica(List<String> numeros){
        int n;
        int suma = 0;
        int cuantos = 0;
        for(String numero : numeros){
            n = Integer.parseInt(numero);
            suma += n;
            if (n % 3 == 0)
                cuantos++;
        }
        System.out.printf("Hay %d números múltiplos de 3 y la media es %f%n", cuantos, (float)suma/(float)numeros.size());
    }
    // Ejemplo de programación funcional (paradigma imperativo). Indicamos que acciones queremos realizar.
    private static void progFuncional(List<String> numeros){
        // Contamos los múltiples de 3
        long cuantosL = numeros.stream()
                .mapToInt(s -> Integer.valueOf(s))//convertimos a Int
                .filter(number -> number % 3 == 0)//filtramos los que sean múltiplo de 3
                .count();//y los contamos

        // la media
        double media = numeros.stream()
                .mapToInt(Integer::valueOf)//Convertimos a int
                .average()//sacamos la media
                .getAsDouble();//devolvemos el valor como double

        System.out.printf("Hay %d números múltiplos de 3 y la media es %f%n", cuantosL, media );
    }
}

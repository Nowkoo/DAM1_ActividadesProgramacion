package U4_ficheros;

import java.io.File;

public class Mybmp {
    /**
     * Uso del programa Mybmp fichero_entrada accion
     * @param args
     * Primer argumento: nombre del fichero
     * Segundo argumento: negativo, oscuro o blancoynegro (según acción a realizar)
     */
    public static void main(String[] args) {
        File f = new File(args[0]);
        TransformaImagen ti = new TransformaImagen(f);
        //args[1] = "negativo";
        if (args[1].equals("negativo"))
            ti.transformaNegativo();
        //args[1] = "oscuro";
        else if (args[1].equals("oscuro"))
            ti.transformaOscuro();
        //args[1] = "blancoynegro";
        else if (args[1].equals("blancoynegro"))
            ti.transformaBlancoNegro();
    }
}

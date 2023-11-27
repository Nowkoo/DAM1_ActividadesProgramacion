package U4_ficheros;

import java.io.File;

public class TransformaImagen {
    static File f;
    TransformaImagen(File fEnt) {
        if (fEnt.exists() && isBmp(fEnt))
            f = fEnt;
        else
            System.out.println("El archivo no existe o no es .bmp");
    }

    public static void main(String[] args) {
    }

    static boolean isBmp(File f) {
        if (f.getName().contains(".")) {
            int index = f.getName().lastIndexOf(".");
            String extension = f.getName().substring(index);

            return extension.equals(".bmp");
        }

        return false;
    }

    static void transformaNegativo() {}

    static void transformaOscuro() {}

    static void transformaBlancoNegro() {}
}

package U4_ficheros;

import java.io.*;

public class TransformaImagen {
    static File f;
    TransformaImagen(File fEnt) {
        if (fEnt.exists() && isBmp(fEnt))
            f = fEnt;
        else
            System.out.println("El archivo no existe o no es .bmp");
    }

    public static void main(String[] args) throws IOException {
        new TransformaImagen(new File("./recursos/pluginfile.bmp"));
        transformaNegativo();
        transformaOscuro();
    }

    static boolean isBmp(File f) {
        if (f.getName().contains(".")) {
            int index = f.getName().lastIndexOf(".");
            String extension = f.getName().substring(index);

            return extension.equals(".bmp");
        }

        return false;
    }

    static void transformaNegativo() throws IOException {
        File negativo = new File("./recursos/" + nombreFichero("_n"));
        FileInputStream f_in = new FileInputStream(f);
        FileOutputStream f_out = new FileOutputStream(negativo);

        byte[] cabecera = new byte[54];
        f_in.read(cabecera);
        f_out.write(cabecera);

        /*for (int i = 0; i < 54; i++) {
            num = f_in.read();
            f_out.write(num);
        }*/

        int num;
        num = f_in.read();

        while (num != -1) {
            f_out.write(255 - num);
            num = f_in.read();
        }

        f_in.close();
        f_out.close();
    }

    static void transformaOscuro() throws IOException {
        File oscuro = new File("./recursos/" + nombreFichero("_o"));
        FileInputStream f_in = new FileInputStream(f);
        FileOutputStream f_out = new FileOutputStream(oscuro);

        byte[] cabecera = new byte[54];
        f_in.read(cabecera);
        f_out.write(cabecera);

        int num;
        num = f_in.read();

        while (num != -1) {
            f_out.write(num/2);
            num = f_in.read();
        }

        f_in.close();
        f_out.close();
    }

    static void transformaBlancoNegro() throws IOException {
        File blancoNegro = new File("./recursos/" + nombreFichero("_bn"));
        FileInputStream f_in = new FileInputStream(f);
        FileOutputStream f_out = new FileOutputStream(blancoNegro);

        byte[] cabecera = new byte[54];
        f_in.read(cabecera);
        f_out.write(cabecera);

        int num;
        num = f_in.read();

        while (num != -1) {
            for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0:
                        int red = num;
                        break;
                    case 1:
                        int green = num;
                        break;
                    case 2:
                        int blue = num;
                        break;
                }
            }
        }
    }

    static String nombreFichero(String n) {
        String nombre = f.getName();
        String nuevoNombre = nombre.substring(0, nombre.lastIndexOf('.'));
        nuevoNombre += n + ".bmp";

        return nuevoNombre;
    }
}

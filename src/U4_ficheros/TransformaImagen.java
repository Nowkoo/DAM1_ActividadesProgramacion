package U4_ficheros;

import java.io.*;

public class TransformaImagen {
    private File f;
    TransformaImagen(File fEnt) {
        if (fEnt.exists() && isBmp(fEnt))
            f = fEnt;
        else
            System.out.println("El archivo no existe o no es .bmp");
    }

    public  boolean isBmp(File f) {
        if (f.getName().contains(".")) {
            int index = f.getName().lastIndexOf(".");
            String extension = f.getName().substring(index);

            return extension.equals(".bmp");
        }

        return false;
    }

    public void transformaNegativo()  {
        try {
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

        catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }

    public void transformaOscuro() {
        //File oscuro;
        //FileInputStream f_in;
        //FileOutputStream f_out;
        try {
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

        }catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }

    public void transformaBlancoNegro() {
        try {
            File blancoNegro = new File("./recursos/" + nombreFichero("_bn"));
            FileInputStream f_in = new FileInputStream(f);
            FileOutputStream f_out = new FileOutputStream(blancoNegro);

            byte[] cabecera = new byte[54];
            f_in.read(cabecera);
            f_out.write(cabecera);

            int rojo, verde, azul, media;
            int num = f_in.read();

            while (num != -1) {
                rojo = num;
                num = f_in.read();
                verde = num;
                num = f_in.read();
                azul = num;

                media = (rojo + verde + azul) / 3;
                f_out.write(media);
                f_out.write(media);
                f_out.write(media);

                num = f_in.read();
            }

            f_in.close();
            f_out.close();
        }

        catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
        finally{

        }
    }

    String nombreFichero(String n) {
        String nombre = f.getName();
        String nuevoNombre = nombre.substring(0, nombre.lastIndexOf('.'));
        nuevoNombre += n + ".bmp";

        return nuevoNombre;
    }
}

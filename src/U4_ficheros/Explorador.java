package U4_ficheros;
import java.io.File;
import java.io.IOException;

public class Explorador {
    public static void main(String[] args) {
        File f0 = File.listRoots()[0];

        for(String s: f0.list()) {
            System.out.println(s);
        }

    }

    public static void print(File f) throws IOException {
        if(f.exists()) {
            if(f.isDirectory()) {
                System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
                System.out.println("---------------------------------------------------");

                for(File e:)
            }
        }
    }
}

package U4_ficheros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        File file1 = new File("");

    }

    public static void readFile(File f) throws IOException {
        FileInputStream f_in = new FileInputStream(f);
        int c = f_in.read();
    }
}

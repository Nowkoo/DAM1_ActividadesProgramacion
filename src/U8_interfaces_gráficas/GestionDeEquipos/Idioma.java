package U8_interfaces_gráficas.GestionDeEquipos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Idioma extends Properties {
    public static final int spanish = 0;
    public static final int english = 1;

    public Idioma(int idioma) {
        switch (idioma) {
            case 0:
                getProperties("recursos/GEespanol.properties");
                break;
            case 1:
                getProperties("recursos/GEingles.properties");
                break;
            default:
                getProperties("recursos/GEespanol.properties");
        }
    }

    public void getProperties(String idiomaFile) {
        try {
            this.load(new FileInputStream(new File(idiomaFile)));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}

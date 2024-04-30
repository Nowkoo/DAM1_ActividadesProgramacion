package U8_interfaces_gráficas.Ejemplos_MenuBar.Example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Language extends Properties{
    public static final int spanish = 0;
    public static final int english = 1;
    public Language(int lang){
        //Modificar si quieres añadir mas idiomas
        switch(lang){
            case spanish:
                getProperties("recursos/espanol.properties");
                break;
            case english:
                getProperties("recursos/ingles.properties");
                break;
            default:
                getProperties("recursos/espanol.properties");
        }

    }

    private void getProperties(String langFile) {
        try {
            //this.load( getClass().getResourceAsStream(langFile) );
            this.load( new FileInputStream(new File(langFile)));
        } catch (IOException ex) {

        }
    }
}
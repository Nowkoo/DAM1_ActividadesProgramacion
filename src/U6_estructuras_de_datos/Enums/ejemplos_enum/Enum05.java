package U6_estructuras_de_datos.Enums.ejemplos_enum;
/**
 * Podemos asignar valores a nuestras constantes enum
 **/

public class Enum05 {

    static class Brillo {
        private double valor;
        Brillo(double v){valor=v;}
        public void setValor(double v){valor=v;}
        public double getValor(){return valor;}
    }
    enum SuperColor{
        none("ninguno", 1, 0), black("negro", 2, 10), silver("plateado", 4, 20);
        //static int foo =2;
        private int rbg;
        private String nombre;
        private Brillo brillo;
        SuperColor(String initNombre, int initRbg, double initBrillo){
            nombre = initNombre;
            rbg = initRbg;
            brillo = new Brillo(initBrillo);

        }
        public String toString(){return nombre + " rbg:" + rbg + " brillo:" + brillo.getValor();}
    }
    static SuperColor c, d;
    public static void main(String[] args) {
        c = SuperColor.silver;
        d = SuperColor.silver;
        System.out.println(c.equals(d));
        System.out.println(c);
        d.brillo.setValor(100);
        System.out.println(c);
    }

}

package U5_POO.T04;

public class Autor {
    private String nombre;
    private char genero;
    private String email;

    Autor(String nombre, char genero, String email) {
        setEmail(email);
        this.nombre = nombre;
        setGenero(genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if(genero == 'm' || genero == 'f' || genero == 'n')
            this.genero = genero;
        else
            genero = ' ';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.matches("\\w+@\\w+"))
            this.email = email;
        else
            this.email = "";
    }

    public String toString() {
        return nombre + " (" + genero + ") " + email;
    }
}

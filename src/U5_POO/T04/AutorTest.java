package U5_POO.T04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void setEmail() {
        Autor autor = new Autor("Autor", 'f', "xxx@yyy");
        assertEquals("Autor", autor.getNombre());
        assertEquals("xxx@yyy", autor.getEmail());

        autor.setEmail("email@yyy");
        assertEquals("email@yyy", autor.getEmail());

        autor.setEmail("invalido");
        assertEquals("", autor.getEmail());
    }

    @Test
    void testToString() {
        Autor autor = new Autor("Autor", 'f', "xxx@yyy");
        assertEquals("Autor (f) xxx@yyy", autor.toString());
    }

    @Test
    void setGenero() {
        Autor autor = new Autor("Autor", 'f', "xxx@yyy");

    }
}
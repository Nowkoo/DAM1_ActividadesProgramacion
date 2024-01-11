package U5_POO.T04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void setNombre() {
        Libro libro = new Libro("Nombre", new Autor("Autor", 'f', "xxx@yyy"), 20.5, 10);
        libro.setNombre("prueba");
        assertEquals("prueba", libro.getNombre());
    }

    @Test
    void setAutor() {
        Libro libro = new Libro("Nombre", new Autor("Autor", 'f', "xxx@yyy"), 20.5, 10);
        Autor autor = new Autor("Prueba", 'f', "email@yyy");
        libro.setAutor(autor);
        assertEquals(autor, libro.getAutor());
    }

    @Test
    void setPrecio() {
        Libro libro = new Libro("Nombre", new Autor("Autor", 'f', "xxx@yyy"), 20.5, 10);
        libro.setPrecio(100);
        assertEquals(100, libro.getPrecio());
    }

    @Test
    void setStock() {
        Libro libro = new Libro("Nombre", new Autor("Autor", 'f', "xxx@yyy"), 20.5, 10);
        libro.setStock(1);
        assertEquals(1, libro.getStock());
    }

    @Test
    void testToString() {
        Libro libro = new Libro("Nombre", new Autor("Autor", 'f', "xxx@yyy"), 20.5, 10);
        assertEquals("Nombre. Autor (f) xxx@yyy", libro.toString());
    }
}
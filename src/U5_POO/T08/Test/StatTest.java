package U5_POO.T08.Test;

import U5_POO.T08.Character.Stat.Constitucion;
import U5_POO.T08.Character.Stat.Stat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatTest {

    @Test
    void getValue() {
        Stat stat = new Constitucion(10);
        assertEquals(10, stat.getValue());
    }

    @Test
    void increase() {
        Stat stat = new Constitucion(10);
        stat.increase();
        assertEquals(11, stat.getValue());
    }

    @Test
    void decrease() {
        Stat stat = new Constitucion(10);
        stat.decrease();
        assertEquals(9, stat.getValue());
    }

    @Test
    void testToString() {
        Stat stat = new Constitucion(10);
        assertEquals("Constitucion", stat.toString());
    }
}
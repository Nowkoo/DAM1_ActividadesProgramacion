package U5_POO.T08.Test;

import U5_POO.T08.Character.Race.Elfo;
import U5_POO.T08.Character.Race.Orco;
import U5_POO.T08.Character.Race.Race;
import U5_POO.T08.Character.Stat.Destreza;
import U5_POO.T08.Character.Stat.Stat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

    @Test
    void modifier() {
        Race race = new Elfo();
        Stat stat = new Destreza(0);
        assertEquals(3, race.modifier(stat));
    }

    @Test
    void testEquals() {
        Race elfo1 = new Elfo();
        Race elfo2 = new Elfo();
        Race orco = new Orco();
        assertTrue(elfo1.equals(elfo2));
        assertFalse(elfo1.equals(orco));
    }

    @Test
    void testToString() {
        Race race = new Elfo();
        assertEquals("Elfo", race.toString());
    }
}
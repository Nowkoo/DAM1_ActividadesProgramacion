package U5_POO.T08.Test;

import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Profession.Mago;
import U5_POO.T08.Character.Profession.Profession;
import U5_POO.T08.Character.Stat.Destreza;
import U5_POO.T08.Character.Stat.Stat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessionTest {

    @Test
    void modifier() {
        Profession asesino = new Asesino();
        Stat stat = new Destreza(0);
        assertEquals(3, asesino.modifier(stat));
    }

    @Test
    void testEquals() {
        Profession asesino1 = new Asesino();
        Profession asesino2 = new Asesino();
        Profession mago = new Mago();
        assertTrue(asesino1.equals(asesino2));
        assertFalse(asesino1.equals(mago));
    }

    @Test
    void testToString() {
        Profession mago = new Mago();
        assertEquals("Mago", mago.toString());
    }
}
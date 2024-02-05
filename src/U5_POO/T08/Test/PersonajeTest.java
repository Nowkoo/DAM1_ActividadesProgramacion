package U5_POO.T08.Test;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Profession.Mago;
import U5_POO.T08.Character.Race.Elfo;
import U5_POO.T08.Character.Race.Humano;
import U5_POO.T08.Character.Stat.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    @Test
    void getName() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals("Mar", personaje.getName());
    }

    @Test
    void getRace() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        Humano humano = new Humano();
        Elfo elfo = new Elfo();
        assertEquals(humano, personaje.getRace());
        assertNotEquals(elfo, personaje.getRace());
    }

    @Test
    void getProfession() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        Asesino asesino = new Asesino();
        Mago mago = new Mago();
        assertEquals(asesino, personaje.getProfession());
        assertNotEquals(mago, personaje.getProfession());
    }

    @Test
    void fuerza() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(8, personaje.fuerza());
    }

    @Test
    void destreza() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(9, personaje.destreza());
    }

    @Test
    void inteligencia() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(5, personaje.inteligencia());
    }

    @Test
    void constitucion() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(8, personaje.constitucion());
    }

    @Test
    void velocity() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(18, personaje.velocity());
    }

    @Test
    void power() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(16, personaje.power());
    }

    @Test
    void magic() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(10, personaje.magic());
    }

    @Test
    void testToString() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        String descripcion = "Me llamo Mar. Soy un Humano Asesino. Mis estadísticas son:\nFuerza: 8 | Destreza: 9 | Constitucion: 8 | Inteligencia: 5 | Velocity: 18.0 | Power: 16.0 | Magic: 10.0 | ";
        assertEquals(descripcion, personaje.toString());
    }

    @Test
    void maxHealth() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(275, personaje.maxHealth());
    }

    @Test
    void health() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(275, personaje.health());
    }

    @Test
    void isDead() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertFalse(personaje.isDead());
        personaje.receivesDamage(300);
        assertTrue(personaje.isDead());
    }

    @Test
    void receivesDamage() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        personaje.receivesDamage(10);
        assertEquals(265, personaje.health());
    }

    @Test
    void heals() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        personaje.receivesDamage(10);
        personaje.heals(20);
        assertEquals(275, personaje.health());
    }
}
package U5_POO.T08.Test;

import U5_POO.T08.Character.Character;
import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Profession.Mago;
import U5_POO.T08.Character.Race.Elfo;
import U5_POO.T08.Character.Race.Humano;
import U5_POO.T08.Character.Stat.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void getName() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals("Mar", character.getName());
    }

    @Test
    void getRace() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        Humano humano = new Humano();
        Elfo elfo = new Elfo();
        assertEquals(humano, character.getRace());
        assertNotEquals(elfo, character.getRace());
    }

    @Test
    void getProfession() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        Asesino asesino = new Asesino();
        Mago mago = new Mago();
        assertEquals(asesino, character.getProfession());
        assertNotEquals(mago, character.getProfession());
    }

    @Test
    void fuerza() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(8, character.fuerza());
    }

    @Test
    void destreza() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(9, character.destreza());
    }

    @Test
    void inteligencia() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(5, character.inteligencia());
    }

    @Test
    void constitucion() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(8, character.constitucion());
    }

    @Test
    void velocity() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(18, character.velocity());
    }

    @Test
    void power() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(16, character.power());
    }

    @Test
    void magic() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(10, character.magic());
    }

    @Test
    void testToString() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        String descripcion = "Me llamo Mar. Soy un Humano Asesino. Mis estadísticas son:\nFuerza: 8 | Destreza: 9 | Constitucion: 8 | Inteligencia: 5 | Velocity: 18.0 | Power: 16.0 | Magic: 10.0 | ";
        assertEquals(descripcion, character.toString());
    }

    @Test
    void maxHealth() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(275, character.maxHealth());
    }

    @Test
    void health() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertEquals(275, character.health());
    }

    @Test
    void isDead() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        assertFalse(character.isDead());
        character.receivesDamage(300);
        assertTrue(character.isDead());
    }

    @Test
    void receivesDamage() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        character.receivesDamage(10);
        assertEquals(265, character.health());
    }

    @Test
    void heals() {
        Character character = new Character("Mar", new Humano(), new Asesino(), new StatsKit(5));
        character.receivesDamage(10);
        character.heals(20);
        assertEquals(275, character.health());
    }
}
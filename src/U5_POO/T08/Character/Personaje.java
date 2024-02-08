package U5_POO.T08.Character;

import U5_POO.T08.Character.Profession.Profession;
import U5_POO.T08.Character.Race.Race;
import U5_POO.T08.Character.Stat.*;
import U5_POO.T08.Item.*;

public class Personaje implements Damageable {
    String name;
    Race race;
    Profession profession;
    StatsKit stats;
    private double health;


    public Personaje(String name, Race race, Profession profession, StatsKit stat) {
        this.name = name;
        this.race = race;
        this.profession = profession;
        this.stats = stat;
        this.health = maxHealth();
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Profession getProfession() {
        return profession;
    }

    public int fuerza() {
        return stats.getFuerza().getValue() + race.modifier(stats.getFuerza()) + profession.modifier(stats.getFuerza());
    }

    public int destreza() {
        return stats.getDestreza().getValue() + race.modifier(stats.getDestreza()) + profession.modifier(stats.getDestreza());
    }

    public int inteligencia() {
        return stats.getInteligencia().getValue() + race.modifier(stats.getInteligencia()) + profession.modifier(stats.getInteligencia());
    }

    public int constitucion() {
        return stats.getConstitucion().getValue() + race.modifier(stats.getConstitucion()) + profession.modifier(stats.getConstitucion());
    }

    //(Valor base Dexterity + bonif. raza + bonif.profesion)*2
    public double velocity() {
        return destreza() * 2;
    }

    //(Valor base Strength + bonif. raza + bonif.profesion)*2
    public double power() {
        return fuerza() * 2;
    }

    //(Valor base Intelligence + bonif. raza + bonif.profesion)*2
    public double magic() {
        return inteligencia() * 2;
    }

    //Muestra toda la información de un personaje
    public String toString() {
        return String.format("Me llamo %s. Soy un %s %s. Mis estadísticas son:\nFuerza: %d Destreza: %d Constitución: %d Inteligencia: %d Velocidad: %.1f Poder: %.1f Magia: %.1f Vida: %.1f",
                name, race.toString(), profession.toString(), fuerza(), destreza(), constitucion(), inteligencia(), velocity(), power(), magic(), health);
    }

    @Override
    public double maxHealth() {
        return (constitucion() + race.modifier(stats.getConstitucion()) + profession.modifier(stats.getConstitucion())) * 25;
    }

    @Override
    public double health() {
        return health;
    }

    @Override
    public boolean isDead() {
        return health <= 0;
    }

    @Override
    public void receivesDamage(double amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
        System.out.printf("%s ha recibido %.1f de daño. Vida:: %.1f/%.1f%n", name, amount, health, maxHealth());
    }

    @Override
    public void heals(double amount) {
        health += amount;
        if (health > maxHealth()) {
            health = maxHealth();
        }
        System.out.printf("%s se ha curado %.1f de vida. Vida: %.1f/%.1f%n", name, amount, health, maxHealth());
    }

    public void consumir(float power) {
        if (power >= 0) {
            heals(power);
        } else {
            receivesDamage(-power);
        }
    }
}

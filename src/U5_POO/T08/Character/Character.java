package U5_POO.T08.Character;

import U5_POO.T08.Character.Profession.Profession;
import U5_POO.T08.Character.Race.Race;
import U5_POO.T08.Character.Stat.*;

import java.util.concurrent.CompletionService;

public class Character implements Damageable {
    String name;
    Race race;
    Profession profession;
    StatsKit stats;
    int damage;

    public Character(String name, Race race, Profession profession, StatsKit stat) {
        this.name = name;
        this.race = race;
        this.profession = profession;
        this.stats = stat;
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
        return "Me llamo " + getName() + ". Soy un " + race.toString() + " " +
                profession.toString() + ". Mis estadísticas son:\n" +
                stats.getFuerza().toString() + ": " + fuerza() + " | " +
                stats.getDestreza().toString() + ": " + destreza() + " | " +
                stats.getConstitucion().toString() + ": " + constitucion() + " | " +
                stats.getInteligencia().toString() + ": " + inteligencia() + " | " +
                "Velocity: " + velocity() + " | " +
                "Power: " + power() + " | " +
                "Magic: " + magic() + " | ";
    }

    @Override
    public double maxHealth() {
        return (constitucion() + race.modifier(stats.getConstitucion()) + profession.modifier(stats.getConstitucion())) * 25;
    }

    @Override
    public double health() {
        return maxHealth() - damage;
    }

    @Override
    public boolean isDead() {
        return damage >= health();
    }

    @Override
    public void receivesDamage(double amount) {
        damage += amount;
        if (damage > maxHealth())
            damage = (int) maxHealth();
        System.out.println(name + " ha recibido " + amount + " de daño. Vida actual: " + health() + "/" + maxHealth());
    }

    @Override
    public void heals(double amount) {
        damage -= amount;
        if (damage <= 0)
            damage = 0;
        System.out.println(name + " se ha curado " + amount + " de vida. Vida actual: " + health() + "/" + maxHealth());
    }
}

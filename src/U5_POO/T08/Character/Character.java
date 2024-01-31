package U5_POO.T08.Character;

import U5_POO.T08.Character.Profession.Profession;
import U5_POO.T08.Character.Race.Race;
import U5_POO.T08.Character.Stat.*;

import java.util.concurrent.CompletionService;

public class Character {
    String name;
    Race race;
    Profession profession;
    Fuerza fuerza;
    Constitucion constitucion;
    Destreza destreza;
    Inteligencia inteligencia;

    public Character(String name, Race race, Profession profession, Fuerza fuerza,
                     Constitucion constitucion, Destreza destreza, Inteligencia inteligencia) {
        this.name = name;
        this.race = race;
        this.profession = profession;
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
        return fuerza.getValue() + race.modifier(fuerza) + profession.modifier(fuerza);
    }

    public int destreza() {
        return destreza.getValue() + race.modifier(destreza) + profession.modifier(destreza);
    }

    public int inteligencia() {
        return inteligencia.getValue() + race.modifier(inteligencia) + profession.modifier(inteligencia);
    }

    public int constitucion() {
        return constitucion.getValue() + race.modifier(constitucion) + profession.modifier(constitucion);
    }

    //(Valor base Dexterity + bonif. raza + bonif.profesion)*2
    public double velocity() {
        return destreza.getValue() * 2;
    }

    //(Valor base Strength + bonif. raza + bonif.profesion)*2
    public double power() {
        return fuerza.getValue() * 2;
    }

    //(Valor base Intelligence + bonif. raza + bonif.profesion)*2
    public double magic() {
        return inteligencia.getValue() * 2;
    }

    //Muestra toda la información de un personaje
    public String toString() {
        System.out.println("Me llamo " + getName() + ". Soy un " + race.toString() + " " +
                profession.toString() + ". Mis estadísticas son:\n" +
                fuerza.toString() + ": " + fuerza() + " | " +
                destreza.toString() + ": " + destreza() + " | " +
                constitucion.toString() + ": " + constitucion() + " | " +
                inteligencia.toString() + ": " + inteligencia() + " | " +
                );
    }
}

package U5_POO.T08.Character;

import U5_POO.T08.Character.Stat.*;
import U5_POO.T08.Item.Equipables.Armadura.Armadura;
import U5_POO.T08.Item.Equipables.Armas.Arma;
import U5_POO.T08.Item.Equipables.Botas.Botas;
import U5_POO.T08.Item.Equipables.Brazalete.Brazalete;
import U5_POO.T08.Item.Equipables.Casco.Casco;
import U5_POO.T08.Item.Equipables.Collar.Collar;
import U5_POO.T08.Item.Equipables.Guantes.Guantes;
import U5_POO.T08.Item.Equipables.ItemEquipable;
import U5_POO.T08.Item.Equipables.Pantalones.Pantalones;

public class Equipamiento {
    Arma armaPrincipal;
    Arma armaSecundaria;
    Casco casco;
    Armadura armadura;
    Pantalones pantalones;
    Botas botas;
    Guantes guantes;
    Collar collar;
    Brazalete brazalete;
    ItemEquipable[] equipamiento;

    public Equipamiento() {
        armaPrincipal = new Arma();
        armaSecundaria = new Arma();
        casco = new Casco();
        armadura = new Armadura();
        pantalones = new Pantalones();
        botas = new Botas();
        guantes = new Guantes();
        collar = new Collar();
        brazalete = new Brazalete();
        equipamiento = new ItemEquipable[] {armaPrincipal, armaSecundaria,
                casco, armadura, pantalones, botas, guantes, collar, brazalete};
    }

    public StatsKit statsEquipamiento() {
        int totalFuerza = 0, totalConstitucion = 0, totalInteligencia = 0, totalDestreza = 0;
        for (ItemEquipable item : equipamiento) {
            StatsKit itemStats = item.getItemStats();
            totalFuerza += itemStats.getFuerza().getValue();
            totalConstitucion += itemStats.getConstitucion().getValue();
            totalInteligencia += itemStats.getInteligencia().getValue();
            totalDestreza += itemStats.getDestreza().getValue();
        }
        return new StatsKit(totalFuerza, totalConstitucion, totalInteligencia, totalDestreza);
    }

    public int modifier(Stat stat) {
        StatsKit statsEquipamiento = statsEquipamiento();
        if (stat instanceof Fuerza) {
            return statsEquipamiento.getFuerza().getValue();
        } else if (stat instanceof Constitucion) {
            return statsEquipamiento.getConstitucion().getValue();
        } else if (stat instanceof Destreza) {
            return statsEquipamiento.getDestreza().getValue();
        } else if (stat instanceof Inteligencia) {
            return statsEquipamiento.getInteligencia().getValue();
        }
        return 0;
    }

    public void actualizarEquipamiento() {
        equipamiento = new ItemEquipable[] {armaPrincipal, armaSecundaria,
                casco, armadura, pantalones, botas, guantes, collar, brazalete};
    }

    public Arma getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(Arma armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
        actualizarEquipamiento();
    }

    public Arma getArmaSecundaria() {
        return armaSecundaria;
    }

    public void setArmaSecundaria(Arma armaSecundaria) {
        this.armaSecundaria = armaSecundaria;
        actualizarEquipamiento();
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
        actualizarEquipamiento();
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
        actualizarEquipamiento();
    }

    public Pantalones getPantalones() {
        return pantalones;
    }

    public void setPantalones(Pantalones pantalones) {
        this.pantalones = pantalones;
        actualizarEquipamiento();
    }

    public Botas getBotas() {
        return botas;
    }

    public void setBotas(Botas botas) {
        this.botas = botas;
        actualizarEquipamiento();
    }

    public Guantes getGuantes() {
        return guantes;
    }

    public void setGuantes(Guantes guantes) {
        this.guantes = guantes;
        actualizarEquipamiento();
    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
        actualizarEquipamiento();
    }

    public Brazalete getBrazalete() {
        return brazalete;
    }

    public void setBrazalete(Brazalete brazalete) {
        this.brazalete = brazalete;
        actualizarEquipamiento();
    }
}

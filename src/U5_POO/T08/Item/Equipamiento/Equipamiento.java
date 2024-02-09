package U5_POO.T08.Item.Equipamiento;

import U5_POO.T08.Character.Stat.*;
import U5_POO.T08.Item.Equipamiento.Armadura.Armadura;
import U5_POO.T08.Item.Equipamiento.Armas.Arma;
import U5_POO.T08.Item.Equipamiento.Botas.Botas;
import U5_POO.T08.Item.Equipamiento.Brazalete.Brazalete;
import U5_POO.T08.Item.Equipamiento.Casco.Casco;
import U5_POO.T08.Item.Equipamiento.Collar.Collar;
import U5_POO.T08.Item.Equipamiento.Guantes.Guantes;
import U5_POO.T08.Item.Equipamiento.Pantalones.Pantalones;

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
        StatsKit statsEquipamiento = new StatsKit(0);
        for (ItemEquipable item : equipamiento) {
            statsEquipamiento.getFuerza().setValue(statsEquipamiento.getFuerza().getValue() + item.getItemStats().getFuerza().getValue());
            statsEquipamiento.getConstitucion().setValue(statsEquipamiento.getConstitucion().getValue() + item.getItemStats().getConstitucion().getValue());
            statsEquipamiento.getDestreza().setValue(statsEquipamiento.getDestreza().getValue() + item.getItemStats().getDestreza().getValue());
            statsEquipamiento.getInteligencia().setValue(statsEquipamiento.getInteligencia().getValue() + item.getItemStats().getInteligencia().getValue());
        }
        return statsEquipamiento;
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

    public Arma getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(Arma armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public Arma getArmaSecundaria() {
        return armaSecundaria;
    }

    public void setArmaSecundaria(Arma armaSecundaria) {
        this.armaSecundaria = armaSecundaria;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Pantalones getPantalones() {
        return pantalones;
    }

    public void setPantalones(Pantalones pantalones) {
        this.pantalones = pantalones;
    }

    public Botas getBotas() {
        return botas;
    }

    public void setBotas(Botas botas) {
        this.botas = botas;
    }

    public Guantes getGuantes() {
        return guantes;
    }

    public void setGuantes(Guantes guantes) {
        this.guantes = guantes;
    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }

    public Brazalete getBrazalete() {
        return brazalete;
    }

    public void setBrazalete(Brazalete brazalete) {
        this.brazalete = brazalete;
    }
}

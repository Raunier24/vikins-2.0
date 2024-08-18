package org.example.war;

import org.example.saxon.Saxon;
import org.example.vikins.Viking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class War {
    private List<Viking> vikingArmy;
    private List<Saxon> saxonArmy;

    // Constructor
    public War() {
        this.vikingArmy = new ArrayList<>();
        this.saxonArmy = new ArrayList<>();
    }

    // Método para obtener el ejército de vikingos
    public List<Viking> getVikingArmy() {
        return this.vikingArmy;
    }

    // Método para obtener el ejército de sajones
    public List<Saxon> getSaxonArmy() {
        return this.saxonArmy;
    }

    // Método para añadir un vikingo al ejército
    public void addViking(Viking viking) {
        this.vikingArmy.add(viking);
    }

    // Método para añadir un sajón al ejército
    public void addSaxon(Saxon saxon) {
        this.saxonArmy.add(saxon);
    }

    // Método para que un vikingo ataque a un sajón
    public String vikingAttack() {
        if (this.saxonArmy.isEmpty() || this.vikingArmy.isEmpty()) {
            return "No hay suficientes tropas para atacar.";
        }
        Random rand = new Random();
        Viking attackingViking = this.vikingArmy.get(rand.nextInt(vikingArmy.size()));
        Saxon targetSaxon = this.saxonArmy.get(rand.nextInt(saxonArmy.size()));
        
        int damage = attackingViking.getStrength();
        targetSaxon.receiveDamage(damage);
        
        if (targetSaxon.getHealth() <= 0) {
            this.saxonArmy.remove(targetSaxon);
        }
        
        return targetSaxon.getMsg();
    }

    // Método para que un sajón ataque a un vikingo
    public String saxonAttack() {
        if (this.saxonArmy.isEmpty() || this.vikingArmy.isEmpty()) {
            return "No hay suficientes tropas para atacar.";
        }
        Random rand = new Random();
        Saxon attackingSaxon = this.saxonArmy.get(rand.nextInt(saxonArmy.size()));
        Viking targetViking = this.vikingArmy.get(rand.nextInt(vikingArmy.size()));
        
        int damage = attackingSaxon.getStrength();
        targetViking.receiveDamage(damage);
        
        if (targetViking.getHealth() <= 0) {
            this.vikingArmy.remove(targetViking);
        }
        
        return targetViking.getMsg();
    }
}
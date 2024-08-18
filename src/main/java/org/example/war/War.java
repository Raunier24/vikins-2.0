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

    // Método para obtener la lista de vikingos
    public List<Viking> getVikingArmy() {
        return vikingArmy;
    }

    // Método para obtener la lista de saxones
    public List<Saxon> getSaxonArmy() {
        return saxonArmy;
    }

    // Método para añadir un vikingo al ejército
    public void addViking(Viking viking) {
        this.vikingArmy.add(viking);
    }

    // Método para añadir un saxón al ejército
    public void addSaxon(Saxon saxon) {
        this.saxonArmy.add(saxon);
    }

    // Método para manejar el ataque de un vikingo a un saxón
    public String vikingAttack() {
        if (saxonArmy.isEmpty() || vikingArmy.isEmpty()) {
            return null;
        }

        // Selecciona un saxón y un vikingo al azar
        Saxon saxon = saxonArmy.get(new Random().nextInt(saxonArmy.size()));
        Viking viking = vikingArmy.get(new Random().nextInt(vikingArmy.size()));

        // El saxón recibe daño igual a la fuerza del vikingo
        saxon.receiveDamage(viking.attack());

        // Si el saxón muere, se elimina del ejército
        if (saxon.getHealth() <= 0) {
            saxonArmy.remove(saxon);
        }

        // Retorna el mensaje correspondiente
        return saxon.getMsg();
    }

    // Método para manejar el ataque de un saxón a un vikingo
    public String saxonAttack() {
        if (saxonArmy.isEmpty() || vikingArmy.isEmpty()) {
            return null;
        }

        // Selecciona un vikingo y un saxón al azar
        Viking viking = vikingArmy.get(new Random().nextInt(vikingArmy.size()));
        Saxon saxon = saxonArmy.get(new Random().nextInt(saxonArmy.size()));

        // El vikingo recibe daño igual a la fuerza del saxón
        viking.receiveDamage(saxon.attack());

        // Si el vikingo muere, se elimina del ejército
        if (viking.getHealth() <= 0) {
            vikingArmy.remove(viking);
        }

        // Retorna el mensaje correspondiente
        return viking.getMsg();
    }
}
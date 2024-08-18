package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    private String msg;

    // Constructor que recibe health y strength
    public Saxon(int health, int strength) {
        super(health, strength); // Llama al constructor de Soldier
    }

    // Método attack que devuelve la propiedad strength
    public int attack() {
        return this.strength; // Retorna la fuerza del Saxon
    }

    // Método receiveDamage que resta el daño recibido de la salud
    public void receiveDamage(int damage) {
        super.receiveDamage(damage); // Llama a receiveDamage de Soldier

        // Verifica si la salud es mayor a 0 para determinar el mensaje
        if (this.health > 0) {
            this.msg = "A Saxon has received " + damage + " points of damage";
        } else {
            this.msg = "A Saxon has died in combat";
        }
    }

    // Método que retorna el mensaje guardado
    public String getMsg() {
        return this.msg;
    }

    public int getHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setHealth(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getStrength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
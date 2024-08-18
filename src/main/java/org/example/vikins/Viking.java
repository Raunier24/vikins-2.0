package org.example.vikins;

import org.example.soldier.Soldier;

public class Viking extends Soldier {
    public String name;

    // Constructor
    public Viking(String name, int health, int strength) {
        super(health, strength);  // Llama al constructor de la clase Soldier
        this.name = name;
    }

    // Método attack que devuelve la fuerza del vikingo
    public int attack() {
        return this.getStrength();
    }

    // Método receiveDamage que reduce la salud en función del daño recibido
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        if (this.getHealth() > 0) {
            this.msg = this.name + " has received " + damage + " points of damage";
        } else {
            this.msg = this.name + " has died in combat";
        }
    }

    // Método getMsg que devuelve el mensaje generado después de recibir daño
    public String getMsg() {
        return this.msg;
    }

    // Método battleCry que devuelve el grito de batalla del vikingo
    public String battleCry() {
        return "Odin Owns You All!";
    }

    // Método para obtener el nombre del vikingo
    public String getName() {
        return this.name;
    }

    // Métodos para obtener la salud y la fuerza del vikingo
    public int getHealth() {
        return super.getHealth();
    }

    public int getStrength() {
        return super.getStrength();
    }

    // Método para establecer la salud del vikingo
    public void setHealth(int health) {
        super.setHealth(health);
    }
}
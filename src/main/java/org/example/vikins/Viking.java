package org.example.vikins;

import org.example.soldier.Soldier;

public class Viking extends Soldier {
    public String name;
    public int health;
    public int strength;
    String msg;

    // Constructor
    public Viking(String name, int health, int strength) {
        super(health, strength);  // Llama al constructor de la clase Soldier
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    // Método attack que devuelve la fuerza del vikingo
    public int attack() {
        return this.strength;
    }

    // Método receiveDamage que reduce la salud en función del daño recibido
    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health > 0) {
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
}
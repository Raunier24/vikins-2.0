package org.example.soldier;

public class Soldier {
    public int health;
    public int strength;
    protected String msg;

    // Constructor
    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    // Método para recibir daño
    public void receiveDamage(int damage) {
        this.health -= damage;
    }

    // Método para atacar (devuelve la fuerza del soldado)
    public int attack() {
        return this.strength;
    }

    // Métodos para obtener la salud y la fuerza
    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    // Método para establecer la salud
    public void setHealth(int health) {
        this.health = health;
    }
}
package org.example.soldier;

public class Soldier {

   
    // Property class Soldier
    public int health;
    public int strength;

    public Soldier(int health, int strength) {

        if (health < 0 || strength < 0) {

            throw new IllegalArgumentException("Health and strength must be non-negative");

        }

        this.health = health;

        this.strength = strength;

    }


    public int attack(int damage) {

        return this.strength;

    }


    public void receiveDamage(int damage) {

        if (damage < 0) {

            throw new IllegalArgumentException("Damage must be non-negative");

        }

        this.health -= damage;

        if (this.health < 0) {

            this.health = 0;

        }

    }

}
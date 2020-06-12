package com.company;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damege) {
        this.health = this.health - damege;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player.
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}

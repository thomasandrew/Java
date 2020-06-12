package com.company;

public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100; // I changed the name and the getter and is still working.
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damege) {
        this.hitPoints = this.hitPoints - damege;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player.
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}

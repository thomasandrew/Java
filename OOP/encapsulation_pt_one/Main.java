package com.company;

public class Main {

    public static void main(String[] args) {
       // Player player = new Player();
       // player.name = "Tim";
       // player.health = 20;
       // player.weapon = "Sword";

       // int damege = 10;
       // player.loseHealth(damege);
       // System.out.println("Remaining health = " + player.healthRemaining());

       // damege = 11;
       // player.health = 200;
       // player.loseHealth(damege);
       // System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}

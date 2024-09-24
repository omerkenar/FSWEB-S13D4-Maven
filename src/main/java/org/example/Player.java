package org.example;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkHealthPercentage(healthPercentage);
        this.weapon = weapon;
    }

    private void checkHealthPercentage(int healthPercentage) {
        if (healthPercentage<0){
            this.healthPercentage=0;
        } else if (healthPercentage>100){
            this.healthPercentage=100;
        } else {this.healthPercentage=healthPercentage;}
    }

    public int healthRemaining(){
        return this.healthPercentage;
    }

    public void loseHealth(int damage){
        int kalanHealt = healthPercentage-damage;
        if(kalanHealt<=0){
            System.out.println(name + " player has been knocked out of game");
        }

        healthPercentage=kalanHealt;
       checkHealthPercentage(healthPercentage);
    }

    public void restoreHealth(int healthPotion){
        this.healthPercentage+=healthPotion;
        checkHealthPercentage(this.healthPercentage);
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
       /* Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());*/

        Player player1 = new Player("ömer", 80, Weapon.SHOTGUN);
        Player player2 = new Player("umut", 100, Weapon.PISTOL);

        player1.loseHealth( (int) (player2.getWeapon().getDamage()*player2.getWeapon().getAttackSpeed()));
        player1.loseHealth( (int) (player2.getWeapon().getDamage()*player2.getWeapon().getAttackSpeed()));
        player1.loseHealth( (int) (player2.getWeapon().getDamage()*player2.getWeapon().getAttackSpeed()));
        player1.loseHealth( (int) (player2.getWeapon().getDamage()*player2.getWeapon().getAttackSpeed()));

        System.out.println("kalan can: " + player1.healthRemaining());

        player1.restoreHealth(700);
        System.out.println("kalan can: " + player1.healthRemaining());
    }
}
package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
//		Player player = new Player();
//		player.name = "Sam";
//		player.health = 20;
//		player.weapon = "Sword";
//
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//
//		damage = 11;
//		player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("Matt", 150, "Katana");
		System.out.println("Initial health is " + player.getHealth());
	}
}

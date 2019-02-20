package Classes;

import GameDefults.Player;

public class Zombie extends Player {

	public Zombie(String name) {
		super(name);
	}

	private String deathdate = "now";

	public String getDeathdate() {
		return deathdate;
	}

	@Override
	public void sayName() {
		System.out.println("My Name Is " + this.name + " and I'm a Zombie");

	}

}

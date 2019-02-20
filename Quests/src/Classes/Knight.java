package Classes;

import GameDefults.Player;

public class Knight extends Player {

	public Knight(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	String weapon;
	int armor;

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String useWeapon() {
		return this.weapon;

	}

	@Override
	public void sayName() {
		System.out.println("My Name Is " + this.name + " and I'm a Knight");
	}

}

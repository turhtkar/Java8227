package Classes;

import GameDefults.Player;

public class Superman extends Player {

	private int speed;

	public Superman(String name) {
		super(name);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void increaseSpeed(int speed) {
		this.setSpeed(this.getSpeed() + speed);
	}

	public void decreaseSpeed(int speed) {
		this.setSpeed(this.getSpeed() - speed);
	}

	@Override
	protected void sayName() {
		System.out.println("My Name Is " + name + " and I'm a Superman");
	}
}

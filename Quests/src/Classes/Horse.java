package Classes;

public class Horse extends Animal {

	public Horse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	int speed;

	public void increaseSpeed(int speed) {
		this.setSpeed(this.getSpeed() + speed);
	}

	public void decreaseSpeed(int speed) {
		this.setSpeed(this.getSpeed() - speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

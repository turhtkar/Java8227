package Classes;

public class Gun extends Weapon {

	private int bullets;

	public Gun(int strength) {
		super(strength);
		// TODO Auto-generated constructor stub
	}

	public int shootGun(int bullet) {
		this.bullets -= bullet;
		return bullets;

	}

	public int addBullets(int bullet) {
		this.bullets += bullet;
		return bullets;
	}

}

package Classes;

public class Knife extends Weapon {

	private final int sharpness;

	public Knife(int strength, int sharpness) {
		super(strength);
		if (sharpness > 10 || sharpness < 0) {
			throw new IllegalArgumentException("Invalid value " + sharpness);
		} else

			this.sharpness = sharpness;
	}

	public int getSharpness() {
		return sharpness;
	}
}

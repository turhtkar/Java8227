package Classes;

abstract public class Weapon {

	private String owner;
	protected final int strength;

	public Weapon(int strength) {
		// value must be in the range of 1 to 100
		if (strength > 100 || strength < 0) {
			throw new IllegalArgumentException("Invalid value " + strength);
		} else

			this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;

	}
}

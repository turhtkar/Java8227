package GameDefults;

public abstract class Player {

	protected String name;

	public Player(String name) {
		this.name = name;
	}

	abstract protected void sayName();

}
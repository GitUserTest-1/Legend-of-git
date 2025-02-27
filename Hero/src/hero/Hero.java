package hero;

public class Hero {
	private String name;
	private int level;

	public Hero(String name) {
		this.name = name;
		this.level = 1;
	}

	public void levelUp() {
		level++;
		System.out.println(name + " ha subido de nivel! Ahora es nivel " + level);
	}

	public void attack() {
		System.out.println(name + " ataca con su espada legendaria!");
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}
}

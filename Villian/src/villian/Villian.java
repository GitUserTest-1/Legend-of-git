package villian;

public class Villian {
	private String name;
	private int powerLevel;

	public Villian(String name, int powerLevel) {
		this.name = name;
		this.powerLevel = powerLevel;
	}

	public void taunt() {
		System.out.println(name + " dice: ¡Nunca podrás vencerme, héroe!");
	}

	public void attack() {
		System.out.println(name + " lanza un ataque oscuro con nivel de poder " + powerLevel + "!");
	}

	public String getName() {
		return name;
	}

	public int getPowerLevel() {
		return powerLevel;
	}
}

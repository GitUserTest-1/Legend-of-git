package leveldesign;

public class LevelDesign {
	private String levelName;
	private int difficulty;

	public LevelDesign(String levelName, int difficulty) {
		this.levelName = levelName;
		this.difficulty = difficulty;
	}

	public void displayLevelInfo() {
		System.out.println("Nivel: " + levelName + " | Dificultad: " + difficulty);
	}
}

package entity;

import javafx.scene.control.Label;

public abstract class Entity implements Play{
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public Entity(String name) {
		this.name=name;
		score = 0;
	}

	@Override
	public void throwDice(Die die) {
		score += die.roll();
	}
	
	public void lose(Label label) {
		
	}
}

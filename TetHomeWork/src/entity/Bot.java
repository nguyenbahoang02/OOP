package entity;

import java.util.Random;

import javafx.scene.control.Label;

public class Bot extends Entity {

	public Bot(String name) {
		super(name);
	}

	public void lose(Label label) {
		Random random = new Random();
		int randomInt = random.nextInt(3);
		switch (randomInt) {
		case 0:
			label.setText("cay thế nhỉ");
			break;
		case 1:
			label.setText("bạn giỏi thật đấy");
			break;
		case 2:
			label.setText("gg");
			break;
		case 3:
			label.setText("bạn thuê trọng tài à");
			break;
		}
	}
}

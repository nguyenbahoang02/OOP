package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import screen.StartingScreenController;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/StartingScreen.fxml"));
		loader.setController(new StartingScreenController(stage));
		Parent root = loader.load();
		stage.setScene(new Scene(root));
		stage.setTitle("Game");
		stage.setResizable(false);
		stage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}

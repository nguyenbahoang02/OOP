package screen;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class StartingScreenController implements Initializable{

	private Stage stage;
	private int numberOfPlayer;
	
	public StartingScreenController(Stage stage) {
		this.stage = stage;
	}
	
	@FXML
	private Button numberBtn;
	
	@FXML
	private ChoiceBox<Integer> choiceBox;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		numberBtn.setVisible(false);
		choiceBox.getItems().add(0);
		choiceBox.getItems().add(1);
		choiceBox.getItems().add(2);
		choiceBox.getItems().add(3);
		choiceBox.getItems().add(4);
		choiceBox.setOnAction(this::getNumberOfPlayer);
		
	}
	
	public void getNumberOfPlayer(ActionEvent event) {
		numberOfPlayer = choiceBox.getValue();
		numberBtn.setVisible(true);
	}
	

    @FXML
    void ok(ActionEvent event) throws IOException {
    	if(numberOfPlayer==0) {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/MainScreen.fxml"));
    		loader.setController(new MainScreenController());
    		Parent root = loader.load();
    		stage.setScene(new Scene(root));
    	}else {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/NamingScreen.fxml"));
    		loader.setController(new NamingScreenController(stage,numberOfPlayer));
    		Parent root = loader.load();
    		stage.setScene(new Scene(root));
    	}
    }
}

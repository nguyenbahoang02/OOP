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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NamingScreenController implements Initializable{
	
	private int numberOfPlayer;
	private Stage stage;
	
	@FXML
	private TextField player_1_name;
	
    @FXML
    private Label player_2;

    @FXML
    private TextField player_2_name;

    @FXML
    private Label player_3;

    @FXML
    private TextField player_3_name;

    @FXML
    private Label player_4;

    @FXML
    private TextField player_4_name;

    public NamingScreenController(Stage stage, int numberOfPlayer) {
    	this.numberOfPlayer = numberOfPlayer;
    	this.stage = stage;
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		switch (numberOfPlayer) {
		case 1:
			player_4.setVisible(false);
			player_4_name.setVisible(false);
			player_3.setVisible(false);
			player_3_name.setVisible(false);
			player_2.setVisible(false);
			player_2_name.setVisible(false);
			break;
		case 2:
			player_4.setVisible(false);
			player_4_name.setVisible(false);
			player_3.setVisible(false);
			player_3_name.setVisible(false);
			break;
		case 3:
			player_4.setVisible(false);
			player_4_name.setVisible(false);
			break;
		case 4:
			break;
		
		}
		
	}
    
	
    @FXML
    void ok(ActionEvent event) throws IOException {
    	int nameCount=0;
    	if(player_1_name.getText()!="") nameCount++;
    	if(player_2_name.getText()!="") nameCount++;
    	if(player_3_name.getText()!="") nameCount++;
    	if(player_4_name.getText()!="") nameCount++;
    	if(nameCount==numberOfPlayer) {
    		ArrayList<String> playerName = new ArrayList<>();
    		switch (numberOfPlayer) {
			case 1:
				playerName.add(player_1_name.getText());
				break;
			case 2:
				playerName.add(player_1_name.getText());
				playerName.add(player_2_name.getText());
				break;
			case 3:
				playerName.add(player_1_name.getText());
				playerName.add(player_2_name.getText());
				playerName.add(player_3_name.getText());
				break;
			case 4:
				playerName.add(player_1_name.getText());
				playerName.add(player_2_name.getText());
				playerName.add(player_3_name.getText());
				playerName.add(player_4_name.getText());
				break;
			
			}
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/MainScreen.fxml"));
    		loader.setController(new MainScreenController(numberOfPlayer,playerName));
    		Parent root = loader.load();
    		stage.setScene(new Scene(root));
    	}
    	
    }
}

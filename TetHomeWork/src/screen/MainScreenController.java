package screen;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import entity.Bot;
import entity.Die;
import entity.Entity;
import entity.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MainScreenController implements Initializable{

	private boolean gameState;
	private int numberOfPlayer;
	//private ArrayList<String> playerName = new ArrayList<>();
	private ArrayList<Entity> player = new ArrayList<Entity>();
	private ArrayList<Die> dice = new ArrayList<Die>();
	
    @FXML
    private Label announcement;

    @FXML
    private Label name1;

    @FXML
    private Label name2;

    @FXML
    private Label name3;

    @FXML
    private Label name4;

    @FXML
    private Label score1;

    @FXML
    private Label score2;

    @FXML
    private Label score3;

    @FXML
    private Label score4;
    
    public MainScreenController(int numberOfPlayer, ArrayList<String> playerName) {
    	this.gameState = true;
    	this.numberOfPlayer = numberOfPlayer;
    	for(int i=0;i<numberOfPlayer;i++) {
    		this.player.add(new Player(playerName.get(i)));
    	}
    	for(int i=1;i<=4-numberOfPlayer;i++) {
    		String tmpName = "Bot " + i;
    		this.player.add(new Bot(tmpName));
    	}
    	for(int i=0;i<4;i++) {
    		dice.add(new Die(i+1));
    	}
    }
    
    public MainScreenController() {
    	this.gameState = true;
    	numberOfPlayer=0;
    	for(int i=1;i<=4;i++) {
    		String tmpName = "Bot " + i;
    		player.add(new Bot(tmpName));
    	}
    	for(int i=0;i<4;i++) {
    		dice.add(new Die(i+1));
    	}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		name1.setText(player.get(0).getName());
		name2.setText(player.get(1).getName());
		name3.setText(player.get(2).getName());
		name4.setText(player.get(3).getName());
		score1.setText("0");
		score2.setText("0");
		score3.setText("0");
		score4.setText("0");
		announcement.setText("Trọng tài chọn người chơi");
	}	
	
	
    @FXML
    void pick1(ActionEvent event) {
    	if(gameState) {
    		Random random = new Random();
    		Die die = dice.get(random.nextInt(3)); 
    		player.get(0).throwDice(die);
    		if(player.get(0).getScore()==21) {
    			announcement.setText(player.get(0).getName()+" win");
    			if(player.get(1) instanceof Bot) {
    				player.get(1).lose(score2);
    			}
    			if(player.get(2) instanceof Bot) {
    				player.get(2).lose(score3);
    			}
    			if(player.get(3) instanceof Bot) {
    				player.get(3).lose(score4);
    			}
    			gameState=false;
    		}else if(player.get(0).getScore()>21) {
    			player.get(0).setScore(0);
    		}
    		score1.setText(""+player.get(0).getScore());
    	}
    }

    @FXML
    void pick2(ActionEvent event) {
    	if(gameState) {
    		Random random = new Random();
    		Die die = dice.get(random.nextInt(3)); 
    		player.get(1).throwDice(die);
    		if(player.get(1).getScore()==21) {
    			announcement.setText(player.get(1).getName()+" win");
    			if(player.get(0) instanceof Bot) {
    				player.get(0).lose(score1);
    			}
    			if(player.get(2) instanceof Bot) {
    				player.get(2).lose(score3);
    			}
    			if(player.get(3) instanceof Bot) {
    				player.get(3).lose(score4);
    			}
    			gameState=false;
    		}else if(player.get(1).getScore()>21) {
    			player.get(1).setScore(0);
    		}
    		score2.setText(""+player.get(1).getScore());
    	}
    }

    @FXML
    void pick3(ActionEvent event) {
    	if(gameState) {
    		Random random = new Random();
    		Die die = dice.get(random.nextInt(3)); 
    		player.get(2).throwDice(die);
    		if(player.get(2).getScore()==21) {
    			announcement.setText(player.get(2).getName()+" win");
    			if(player.get(0) instanceof Bot) {
    				player.get(0).lose(score1);
    			}
    			if(player.get(1) instanceof Bot) {
    				player.get(1).lose(score2);
    			}
    			if(player.get(3) instanceof Bot) {
    				player.get(3).lose(score4);
    			}
    			gameState=false;
    		}else if(player.get(2).getScore()>21) {
    			player.get(2).setScore(0);
    		}
    		score3.setText(""+player.get(2).getScore());
    	}
    }

    @FXML
    void pick4(ActionEvent event) {
    	if(gameState) {
    		Random random = new Random();
    		Die die = dice.get(random.nextInt(3)); 
    		player.get(3).throwDice(die);
    		if(player.get(3).getScore()==21) {
    			announcement.setText(player.get(3).getName()+" win");
    			if(player.get(0) instanceof Bot) {
    				player.get(0).lose(score1);
    			}
    			if(player.get(2) instanceof Bot) {
    				player.get(2).lose(score3);
    			}
    			if(player.get(1) instanceof Bot) {
    				player.get(1).lose(score2);
    			}
    			gameState=false;
    		}else if(player.get(3).getScore()>21) {
    			player.get(3).setScore(0);
    		}
    		score4.setText(""+player.get(3).getScore());
    	}
    }
    
    
}













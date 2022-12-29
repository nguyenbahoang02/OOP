package hust.soict.globalict.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class PainterController {
	javafx.scene.paint.Color color;
    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }
    @FXML
    private ToggleGroup identical;
 
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 8);
    	newCircle.setFill(color);
    	drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void eraser(ActionEvent event) {
    	color =  javafx.scene.paint.Color.WHITE;
    }

    @FXML
    void pen(ActionEvent event) {
    	color = javafx.scene.paint.Color.BLACK;
    }
}

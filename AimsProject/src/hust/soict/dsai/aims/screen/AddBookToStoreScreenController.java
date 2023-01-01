package hust.soict.dsai.aims.screen;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddBookToStoreScreenController {
	private Store store;
    @FXML
    private TextField authors;

    @FXML
    private TextField category;

    @FXML
    private TextField cost;

    @FXML
    private TextField title;

    @FXML
    void add(ActionEvent event) {
    	System.out.println("ecec");
    	List<String> authorList = new ArrayList<String>();
    	authorList.add(authors.getText());
    	store.addMedia(new Book(title.getText(), category.getText(), Float.parseFloat(cost.getText()), authorList));
    }
    
    public AddBookToStoreScreenController(Store store) {
    	this.store = store;
    }

}

package hust.soict.dsai.aims.screen;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddBookToStoreScreenController {
	private Cart cart;
	private Store store;
	private StoreScreen storeScreen;
    @FXML
    private TextField authors;

    @FXML
    private TextField category;

    @FXML
    private TextField cost;

    @FXML
    private TextField title;

    @FXML
    void viewStore(ActionEvent event) {
    	storeScreen.dispose();
    	StoreScreen storeScreen = new StoreScreen(store, cart);
    }
    
    @FXML
    void viewCart(ActionEvent event) {
    	CartScreen cartScreen = new CartScreen(cart, store, storeScreen);
    }
    
    @FXML
    void addDvd(ActionEvent event) {
    	AddDvdToStoreScreen addDvdToStoreScreen = new AddDvdToStoreScreen(store, cart, storeScreen);
    }
    @FXML
    void addCd(ActionEvent event) {
    	AddCdToStoreScreen addCdToStoreScreen = new AddCdToStoreScreen(store, cart, this.storeScreen);
    }
    
    
    @FXML
    void add(ActionEvent event) {
    	List<String> authorList = new ArrayList<String>();
    	authorList.add(authors.getText());
    	store.addMedia(new Book(title.getText(), category.getText(), Float.parseFloat(cost.getText()), authorList));
    	storeScreen.dispose();
    	StoreScreen storeScreen = new StoreScreen(store, cart);
    }
    
    public AddBookToStoreScreenController(Store store, Cart cart, StoreScreen storeScreen) {
    	this.store = store;
    	this.cart = cart;
    	this.storeScreen = storeScreen;
    }

}

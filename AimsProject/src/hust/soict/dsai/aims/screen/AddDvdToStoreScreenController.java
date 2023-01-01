package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddDvdToStoreScreenController {
	private Cart cart;
	private Store store;
	private StoreScreen storeScreen;
	
    public AddDvdToStoreScreenController(Cart cart, Store store, StoreScreen storeScreen) {
		this.cart = cart;
		this.store = store;
		this.storeScreen = storeScreen;
	}
    
	@FXML
    private TextField category;

    @FXML
    private TextField cost;

    @FXML
    private TextField director;

    @FXML
    private TextField length;

    @FXML
    private TextField title;

    @FXML
    void add(ActionEvent event) {
    	store.addMedia(new DigitalVideoDisc(title.getText(), category.getText(), director.getText(), 
    			Integer.parseInt(length.getText()), Float.parseFloat(cost.getText())));
    	storeScreen.dispose();
    	StoreScreen storeScreen = new StoreScreen(store, cart);
    }

    @FXML
    void addBook(ActionEvent event) {
		AddBookToStoreScreen addBookToStoreScreen = new AddBookToStoreScreen(store, cart, storeScreen);
    }
    
    @FXML
    void addCd(ActionEvent event) {
    	AddCdToStoreScreen addCdToStoreScreen = new AddCdToStoreScreen(store, cart, storeScreen);
    }
    
    @FXML
    void viewCart(ActionEvent event) {
    	CartScreen cartScreen = new CartScreen(cart, store, storeScreen);
    }

    @FXML
    void viewStore(ActionEvent event) {
    	storeScreen.dispose();
    	StoreScreen storeScreen = new StoreScreen(store, cart);
    }

}

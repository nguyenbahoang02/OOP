package hust.soict.dsai.aims.screen;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
	
	private Cart cart;
	private Store store;
	private StoreScreen storeScreen;
	private boolean filteredById = false;
	private boolean filteredByTitle = false;
	@FXML
	private TableView<Media> tblMedia;
	
	@FXML
	private TableColumn<Media, String> colMediaTitle;
	
    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;
    
    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    
    public CartScreenController(Cart cart, Store store,StoreScreen storeScreen) {
    	super();
    	this.cart = cart;
    	this.store = store;
    	this.storeScreen = storeScreen;
    }
    
    @FXML
    void addBook(ActionEvent event) {
		AddBookToStoreScreen addBookToStoreScreen = new AddBookToStoreScreen(store, cart, storeScreen);
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
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    	if(cart.getItemsOrdered().size()==0) {
    		totalCost.setText("0.00 $");
    	}
    }
    
    @FXML
    void btnPlayPressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	try {
			media.play();
		} catch (PlayerException e) {
			JOptionPane.showMessageDialog(null, e.getMessage().toString(), "Alert", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
    }
    
    @FXML
    private TextField tfFilter;
    
    @FXML
    void radioBtnFilterId(ActionEvent event) {
    	filteredById = true;
    	filteredByTitle = false;
    }

    @FXML
    void radioBtnFilterTitle(ActionEvent event) {
    	filteredById = false;
    	filteredByTitle = true;
    }
    
    @FXML
    private Label totalCost;
    
    @FXML
    void viewStore(ActionEvent event) {
    	storeScreen.dispose();
    	StoreScreen storeScreen = new StoreScreen(store, cart);
    }
    
    @FXML
    void placeOrder(ActionEvent event) {
    	cart.emptyCart();
    	JDialog jDialog = new JDialog();
    	jDialog.setAlwaysOnTop(true);
		jDialog.setSize(200, 150);
		jDialog.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.weightx = 1.0;
		constraints.gridx = GridBagConstraints.REMAINDER;
		constraints.insets = new Insets(0, 0, 20, 0);
		JLabel jLabel = new JLabel("Your order has been set");
		jDialog.add(jLabel, constraints);
		JButton button = new JButton("OK");
		constraints.insets = new Insets(0, 0, 0, 0);
		jDialog.add(button, constraints);
		jDialog.setLocationRelativeTo(null);
		jDialog.setVisible(true);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				jDialog.setVisible(false);
			}
		});		
    }
    
    @FXML
    private void initialize() {
    	colMediaTitle.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("title"));
    	colMediaCategory.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("category"));
    	colMediaCost.setCellValueFactory(
    			new PropertyValueFactory<Media, Float>("cost"));
    	tblMedia.setItems(cart.getItemsOrdered());
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	totalCost.setText(cart.totalCost() + "$");
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
    		@Override
    		public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
    			if(newValue!=null) {
    				updateButtonBar(newValue);
    				Float total = cart.totalCost();
    				DecimalFormat df = new DecimalFormat("#.00");
    				String totalCostInString = df.format(total);
    				totalCost.setText(totalCostInString + " $");
    			}
    		}
		});
    	tfFilter.textProperty().addListener(new ChangeListener<String>() {
    		@Override
    		public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
    			showFilteredMedia(newValue);
    		}
		});
    	
    }
    void updateButtonBar(Media media) {
    	btnRemove.setVisible(true);
    	if(media instanceof Playable) {
    		btnPlay.setVisible(true);
    	}
    	else {
    		btnPlay.setVisible(false);
    	}
    }
    
    void showFilteredMedia(String string) {
    	if(filteredById == true) {
    		tblMedia.setItems(cart.filteredById(string));
    	}else if(filteredByTitle == true){
    		tblMedia.setItems(cart.filteredByTitle(string));
    	}
    }
}


















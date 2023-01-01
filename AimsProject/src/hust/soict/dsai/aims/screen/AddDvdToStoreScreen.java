package hust.soict.dsai.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddDvdToStoreScreen extends JFrame{
	public AddDvdToStoreScreen(Store store, Cart cart, StoreScreen storeScreen){
		super();
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setResizable(false);
		this.setSize(1024, 768);
		this.setTitle("Adding DVD");
		this.setVisible(true);
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass()
							.getResource("/hust/soict/dsai/aims/screen/AddDvdToStoreScreen.fxml"));
					AddDvdToStoreScreenController controller = 
							new AddDvdToStoreScreenController(cart, store, storeScreen);
					loader.setController(controller);
					Parent rootParent = loader.load();
					fxPanel.setScene(new Scene(rootParent));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}

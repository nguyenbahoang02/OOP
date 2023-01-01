package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame{
	private Store store;
	private Cart cart;
	public StoreScreen(Store store, Cart cart) {
		this.store = store;
		this.cart = cart;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
		}

	JPanel createNorth() {
		JPanel northJPanel = new JPanel();
		northJPanel.setLayout(new BoxLayout(northJPanel, BoxLayout.Y_AXIS));
		northJPanel.add(createMenuBar());
		northJPanel.add(createHeader());
		return northJPanel;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		JMenuItem viewCart = new JMenuItem("View Cart");
		viewCart.addActionListener(new ViewCart(this));
		menu.add(viewCart);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		JButton cart = new JButton("View cart");
		cart.addActionListener(new ViewCart(this));
		cart.setPreferredSize(new Dimension(100, 50));
		cart.setMaximumSize(new Dimension(100, 50));
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for(int i=0; i<store.itemsInStore.size(); i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i),this.cart);
			center.add(cell);
		}
		return center;
	}
	
	private class ViewCart implements ActionListener{
		private StoreScreen storeScreen;
		public ViewCart(StoreScreen storeScreen) {
			this.storeScreen = storeScreen;	
		}
		@Override
		public void actionPerformed(ActionEvent e) { 
			this.storeScreen.setVisible(false);
		}
	}
}
















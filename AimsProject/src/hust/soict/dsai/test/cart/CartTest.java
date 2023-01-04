package hust.soict.dsai.test.cart;
import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class CartTest {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		Media dvd1 = new DigitalVideoDisc(
				"The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);
		Media dvd2 = new DigitalVideoDisc(
				"Stars War", "Science Fiction", "George Lucas", 87, 24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);
		Media dvd3 = new DigitalVideoDisc(
				"Aladin", "Animation", "Roger Allers", 100,18.99f);
		//anOrder.addDigitalVideoDisc(dvd3);
		Media dvdlist[] = new Media[20];
		dvdlist[0] = dvd1;
		dvdlist[1] = dvd2;
		dvdlist[2] = dvd3;
		try {
			anOrder.addMedia(dvd1);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		anOrder.print();
		anOrder.searchByTitle("The Lion King");
		anOrder.searchByTitle("Frozen");
	}

}

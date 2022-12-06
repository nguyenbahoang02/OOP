package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String args[]) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(
				"The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(
				"Stars War", "Science Fiction", "George Lucas", 87, 24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(
				"Aladin", "Animation", "Roger Allers", 100, 18.99f);
		//anOrder.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc dvdlist[] = new DigitalVideoDisc[20];
		store.addDVD(dvd3);
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.removeDVD(0);
		store.print();
	}
}

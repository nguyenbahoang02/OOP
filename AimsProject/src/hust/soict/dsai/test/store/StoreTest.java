package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String args[]) {
		Store store = new Store();
		Media dvd1 = new DigitalVideoDisc(
				"The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		Media dvd2 = new DigitalVideoDisc(
				"The Lion King", "Science Fiction", "George Lucas", 87, 24.95f);
		Media dvd3 = new DigitalVideoDisc(
				"Aladin", "Animation", "Roger Allers", 100, 18.99f);
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(dvd3);
		//store.removeMedia(dvd1);
		store.print();
	}
}

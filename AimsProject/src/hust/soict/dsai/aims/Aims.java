package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
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
		dvdlist[0] = dvd1;
		dvdlist[1] = dvd2;
		dvdlist[2] = dvd3;
		anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		//anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.print();
	}
}

package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
	public ArrayList<DigitalVideoDisc> itemsInStore = 
			new ArrayList<DigitalVideoDisc>();
	public void addDVD(DigitalVideoDisc disc) {
		this.itemsInStore.add(disc);
	}
	public void removeDVD(int id) {
		for (DigitalVideoDisc dvd : itemsInStore) {
			if(dvd.getId()==id) {
				itemsInStore.remove(id);
				break;
			}
		}
	}
	public void print() {
		for (DigitalVideoDisc dvd : itemsInStore) {
			System.out.println(dvd);
		}
	}
}

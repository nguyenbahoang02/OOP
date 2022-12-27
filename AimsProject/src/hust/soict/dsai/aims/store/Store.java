package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	public ArrayList<Media> itemsInStore = 
			new ArrayList<Media>();
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	public void addMedia(Media inputMedia) {
		if(itemsInStore.contains(inputMedia)) {
			System.out.println("This item is already in the Store");
			return;
		}
		itemsInStore.add(inputMedia);
		System.out.println("Item added");
	}
	public void removeMedia(Media inputMedia) {
		if(itemsInStore.contains(inputMedia)) {
			itemsInStore.remove(inputMedia);
			return;
		}
		System.out.println("This item is not in the Store");
	}
	public void print() {
		for (Media media : itemsInStore) {
			System.out.println(media);
		}
	}
	public Media find(String inputMedia) {
		for (Media media : itemsInStore) {
			if(media.getTitle().equals(inputMedia)) {
				return media;				
			}
		}
		return null;
	}
}

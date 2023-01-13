package hust.soict.dsai.aims.cart;
import java.util.Collections;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public ObservableList<Media> itemsOrdered = 
			FXCollections.observableArrayList();

	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public float totalCost(){
		float sum=0;
		for(int i=0;i<this.itemsOrdered.size();i++){
			sum+=this.itemsOrdered.get(i).getCost();
		}
		return sum;
	}
	
	public void addMedia(Media inputMedia) throws LimitExceededException {
		for (Media media : itemsOrdered) {
			if(media.getTitle().equals(inputMedia.getTitle())&&media.getCategory().equals(inputMedia.getCategory())) {
				System.out.println("This item is already in the Cart");
				return;
			}
		}
		if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(inputMedia);
			System.out.println("Item has been added");
		}else {
			throw new LimitExceededException("ERROR: The number of "+ "media has reached its limit");
		}
	}
	
	public void removeMedia(Media inputMedia) {
		for (Media media : itemsOrdered) {
			if(media.getTitle().equals(inputMedia.getTitle())&&media.getCategory().equals(inputMedia.getCategory())) {
				itemsOrdered.remove(media);
				return;
			}
		}
		System.out.println("You don't have this item");
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		for(int i=0;i<itemsOrdered.size();i++) {
			System.out.println(itemsOrdered.get(i));
		}
		System.out.println("Total cost: "+this.totalCost()+"$");
		System.out.println("***************************************************");
	}
	public Media searchByTitle(String title) {
		for(int i=0;i<itemsOrdered.size();i++) {
			if(title.equals(itemsOrdered.get(i).getTitle())) {
				return itemsOrdered.get(i);
			}
		}
		return null;
	}
	
	public ObservableList<Media> filteredById(String Id) {
		if(Id.equals("")) return null;
		int id = Integer.parseInt(Id);
		ObservableList<Media> filteredItems = 
				FXCollections.observableArrayList();
		for(int i=0;i<itemsOrdered.size();i++) {
			if(id==itemsOrdered.get(i).getId()) {
				filteredItems.add(itemsOrdered.get(i));
			}
		}
		return filteredItems;
	}
	
	public ObservableList<Media> filteredByTitle(String Id) {
		ObservableList<Media> filteredItems = 
				FXCollections.observableArrayList();
		if(Id.equals("")) return itemsOrdered;
		for(int i=0;i<itemsOrdered.size();i++) {
			if(itemsOrdered.get(i).getTitle().contains(Id)) {
				filteredItems.add(itemsOrdered.get(i));
			}
		}
		return filteredItems;
	}
	
	public void printNoBook() {
		for (Media media : itemsOrdered) {
			if(!(media instanceof Book)) {
				System.out.println(media);
			}
		}
	}
	
	public void printAll() {
		for (Media media : itemsOrdered) {
			System.out.println(media);
		}
	}
	
	public void printTitle() {
		for (Media media : itemsOrdered) {
			System.out.println(media.getTitle());
		}
	}
	
	public void printID() {
		for (Media media : itemsOrdered) {
			System.out.println(media.getId());
		}
	}
	
	public void emptyCart() {
		itemsOrdered.clear();
	}
	
	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
}

package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public ArrayList<Media> itemsOrdered = 
			new ArrayList<Media>();

	public float totalCost(){
		float sum=0;
		for(int i=0;i<this.itemsOrdered.size();i++){
			sum+=this.itemsOrdered.get(i).getCost();
		}
		return sum;
	}
	
	public void addMedia(Media inputMedia) {
		for (Media media : itemsOrdered) {
			if(media.getTitle().equals(inputMedia.getTitle())&&media.getCategory().equals(inputMedia.getCategory())) {
				System.out.println("This item is already in the Cart");
				return;
			}
		}
		itemsOrdered.add(inputMedia);
		System.out.println("Item has been added");
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

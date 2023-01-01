package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.screen.CartScreen;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class Aims {

	public static String input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the title");
		String inputString = input.nextLine();
		return inputString;
	}
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void mediaDetailsMenuForBooks() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void main(String[] args) {
//		boolean showMenu = true;
//		boolean storeMenu = true;
//		boolean mediaDetails = true;
//		boolean mediaDetailsForBook = true;
//		boolean cartMenu = true;
		Store testStore = new Store();
		Cart testCart = new Cart();
		List<String> authorList = new ArrayList<>();
		authorList.add("Tuan Anh");
		Book book1 = new Book("Book1", "Cate1", 13f, authorList);
		Book book2 = new Book("Book2", "Cate2", 12f, authorList);
		CompactDisc cd1 = new CompactDisc("Title1", "Cate1", "Dir", 5, 16.5f, "Tuan Anh");
		CompactDisc cd2 = new CompactDisc("Title2", "Cate2", "Dir", 6, 6.5f, "Huy");
		Track track1 = new Track("Hoang", 1);
		Track track2 = new Track("Hoang", 2);
		Track track3 = new Track("Nguyet", 3);
		cd1.addTrack(track1);
		cd1.addTrack(track2);
		cd2.addTrack(track3);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladin", "Animation", "Roger Allers", 100, 18.99f);
		testStore.addMedia(dvd1);
		testStore.addMedia(dvd2);
		testStore.addMedia(cd1);
		testStore.addMedia(cd2);
		testStore.addMedia(book1);
		testStore.addMedia(book2);
		StoreScreen testScreen = new StoreScreen(testStore, testCart);
//		while(showMenu) {
//			showMenu();
//			Scanner input = new Scanner(System.in);
//			int menu = input.nextInt();
//			switch (menu){
//			case 0: 
//				showMenu = false;
//				break;
//			case 1:
//				storeMenu = true;
//				while(storeMenu) {
//					storeMenu();
//					int store = input.nextInt();
//					switch (store) {
//					case 0: 
//						storeMenu = false;
//						break;
//					case 1:
//						String inputString = input();
//						if(testStore.find(inputString)!=null&&!(testStore.find(inputString) instanceof Book)) {
//							mediaDetails = true;
//							while(mediaDetails) {
//								mediaDetailsMenu();
//								int media = input.nextInt();
//								switch (media) {
//								case 0:
//									mediaDetails = false;
//									break;
//								case 1:
//									testCart.addMedia(testStore.find(inputString));
//									break;
//								case 2:
//									testStore.find(inputString).play();
//									break;
//								}
//							}
//						}else if(testStore.find(inputString)!=null){
//							mediaDetailsMenuForBooks();
//							mediaDetailsForBook = true;
//							while(mediaDetailsForBook) {
//								int mediaBook = input.nextInt();
//								switch (mediaBook) {
//								case  0:
//									mediaDetailsForBook = false;
//									break;
//								case 1:
//									testCart.addMedia(testStore.find(inputString));
//									break;
//								}
//							}
//						}else System.out.println("Can't find the media");
//						break;
//					case 2:
//						testStore.print();
//						String input1 = input();
//						if(testStore.find(input1)!=null) {
//							testCart.addMedia(testStore.find(input1));
//						}else {
//							System.out.println("Can't find the media");
//						}
//						break;
//					case 3:
//						testCart.printNoBook();
//						String input2 = input();
//						if(testStore.find(input2)!=null) {
//							testStore.find(input2).play();;
//						}else {
//							System.out.println("Can't find the media");
//						}
//						break;
//					case 4:
//						testCart.print();
//						break;
//					}
//				}
//				break;
//			case 2:
//				testStore.print();
//				System.out.println("Do you want to remove or add media to the Store");
//				System.out.println("Type 1 if add or 2 if remove");
//				int inputInt1 = input.nextInt();
//				if(inputInt1==1) {
//					//add later
//					System.out.println("You have added some media to the Store");
//				}else if(inputInt1 == 2) {
//					String input2 = input();
//					if(testStore.find(input2)!=null) {
//						testStore.removeMedia(testStore.find(input2));
//					}else {
//						System.out.println("Can't find the media");
//					}
//				}
//				break;
//			case 3:
//				cartMenu = true;
//				while(cartMenu) {
//					cartMenu();
//					int input3 = input.nextInt();
//					switch (input3) {
//					case 0:
//						cartMenu = false;
//						break;
//					case 1:
//						System.out.println("How do you want to filter your Cart");
//						System.out.println("1. By ID\n2. By Title");
//						int input6 = input.nextInt();
//						if(input6 == 1) {
//							testCart.printID();
//						}
//						else if(input6 == 2) {
//							testCart.printTitle();
//						}
//						break;
//					case 2:
//						System.out.println("How do you want to sort your Cart");
//						System.out.println("1. By cost\n2. By Title");
//						int input5 = input.nextInt();
//						if(input5 == 1) {
//							testCart.sortByCost();
//							testCart.printAll();
//						}
//						else if(input5 == 2) {
//							testCart.sortByTitle();
//							testCart.printAll();
//						}
//						break;
//					case 3:
//						testCart.printAll();
//						String input2 = input();
//						if(testCart.searchByTitle(input2)!=null) {
//							testCart.removeMedia(testCart.searchByTitle(input2));
//						}else {
//							System.out.println("Can't find the media");
//						}
//						break;
//					case 4:
//						testCart.printNoBook();
//						String input4 = input();
//						if(testStore.find(input4)!=null) {
//							testStore.find(input4).play();;
//						}else {
//							System.out.println("Can't find the media");
//						}
//						break;
//					case 5:
//						testCart.emptyCart();
//						System.out.println("An order has been placed");
//						break;
//					}
//				}
//				break;
//			}
//		}
	}
}

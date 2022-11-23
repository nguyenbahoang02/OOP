package hust.soict.dsai.aims;
import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public ArrayList<DigitalVideoDisc> itemsOrdered = 
			new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered=0; 
	public float totalCost;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.qtyOrdered<20) {
			System.out.println("The disc has been added");
			this.itemsOrdered.add(disc);
			qtyOrdered++;
			totalCost+=disc.getCost();
		}else System.out.println("The cart is almost full");
	}
	
//	public void addDigitalVideoDisc(DigitalVideoDisc dvdlist[]) {
//		for(int i=0;dvdlist[i]!=null;i++) {
//			if(this.qtyOrdered<20) {
//				System.out.println("The disc has been added");
//				this.itemsOrdered.add(dvdlist[i]);
//				qtyOrdered++;
//			}else System.out.println("The cart is almost full");
//		}
//	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc ... dvdlist) {
		for (DigitalVideoDisc digitalVideoDisc : dvdlist) {
			if(this.qtyOrdered<20) {
				System.out.println("The disc has been added");
				this.itemsOrdered.add(digitalVideoDisc);
				qtyOrdered++;
				totalCost+=digitalVideoDisc.getCost();
			}else System.out.println("The cart is almost full");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=0;i<qtyOrdered;i++) {
			if(this.itemsOrdered.get(i).equals(disc)) {
				this.itemsOrdered.remove(i);
				qtyOrdered--;
				System.out.println("The disc has been removed");
			}
		}
	}
	
	public float totalCost(){
		float sum=0;
		for(int i=0;i<this.itemsOrdered.size();i++){
			sum+=this.itemsOrdered.get(i).getCost();
		}
		return sum;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println(itemsOrdered.get(i));
		}
		System.out.println("Total cost: "+totalCost+"$");
		System.out.println("***************************************************");
	}
	
	
}

import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public ArrayList<DigitalVideoDisc> itemsOrdered = 
			new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered=0; 
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.qtyOrdered<20) {
			System.out.println("The disc has been added");
			this.itemsOrdered.add(disc);
			qtyOrdered++;
		}else System.out.println("The cart is almost full");
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
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println(itemsOrdered.get(i));
		}
	}
}

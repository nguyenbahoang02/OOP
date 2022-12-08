package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
	private String director;
	private int length;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.director = director;
		this.length = length;
		this.setCost(cost);
		this.setId(getCurrentId());
	}
	
	@Override
	public String toString() {
		return "DVD - [" + this.getTitle() + "] - [" + this.getCategory() + "] - [" + director + "] - ["
				+ length + "] [" + this.getCost() + "$]";
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}

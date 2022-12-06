package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc{
	private String director;
	private int length;
	private static int nbDigitalVideoDisc = 0;
	
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(length, director);
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		id = nbDigitalVideoDisc++;
	}
	@Override
	public boolean equals(Object o) {
		DigitalVideoDisc tmp = (DigitalVideoDisc)o;
		return tmp.title.equals(title) && tmp.category.equals(category);
	}
	@Override
	public String toString() {
		return "DVD - [" + title + "] - [" + category + "] - [" + director + "] - ["
				+ length + "]: [" + cost + "] $";
	}
	
}

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc = 0;
	private int id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		id = nbDigitalVideoDisc++;
	}
	public DigitalVideoDisc() {
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		id = nbDigitalVideoDisc++;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		id = nbDigitalVideoDisc++;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
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

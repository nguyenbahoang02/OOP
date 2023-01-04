package hust.soict.dsai.aims.media;

import java.util.Comparator;

import hust.soict.dsai.aims.exception.PlayerException;

public abstract class Media extends Object{
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int currentId=0;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public int getCurrentId() {
		return currentId++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public Media() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean a = false;
		if(obj instanceof Media) {
			Media objMedia = (Media)obj;
			if(objMedia.getTitle().equals(this.getTitle())) {
				a = true;
			}
		}
		return a;
	}
	public void play() throws PlayerException {
		
	}

}

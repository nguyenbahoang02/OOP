package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public List<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, float cost, List<String> authors) {
		super();
		this.setId(getCurrentId());
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.authors = authors;
	}

	public Book() {
		super();
	}
	
	public void addAuthor(String author) {
		if(authors.contains(author)) {
			System.out.println("The author is already in the AuthorsList");
		}else {
			authors.add(author);
		}
	}
	
	public void removeAuthor(String author) {
		if(authors.contains(author)) {
			authors.remove(author);
		}else {
			System.out.println("The author is not in the AuthorsList");
		}
	}

	@Override
	public String toString() {
		return "Book [" + this.getTitle() 
		+ "] - [" + this.getCategory() 
		+ "] - [" + this.getCost() 
		+ "$] - ["+ authors + "]";
	}
	
}

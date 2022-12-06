package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Booktest {
	public static void main(String args[]) {
		List<String> authorList = new ArrayList<>();
		authorList.add("Hoang");
		Book testBook = new Book(1,"1","2",3,authorList);
		testBook.addAuthor("Hoang");
		testBook.addAuthor("Linh");
		System.out.println(testBook);
		testBook.removeAuthor("Linh");
		System.out.println(testBook);
		CompactDisc compactDisc = new CompactDisc();
		Track track1 = new Track("Hoang", 1);
		Track track2 = new Track("Hoang", 1);
		Track track3 = new Track("Nguyet", 3);
		compactDisc.addTrack(track1);
		compactDisc.addTrack(track2);
		compactDisc.removeTrack(track3);
		
	}
}

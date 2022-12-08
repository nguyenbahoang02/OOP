package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Booktest {
	public static void main(String args[]) {
		List<String> authorList = new ArrayList<>();
		authorList.add("Hoang");
		Book testBook = new Book("The Lion King","2",3f,authorList);
		testBook.addAuthor("Hoang");
		testBook.addAuthor("Linh");
		System.out.println(testBook);
		//testBook.removeAuthor("Linh");
		System.out.println(testBook);
		CompactDisc compactDisc = new CompactDisc("Quang","Hoang", "Hung", 7, 15f, "hehe");
		Track track1 = new Track("Hoang", 1);
		Track track2 = new Track("Hoang", 2);
		Track track3 = new Track("Nguyet", 3);
		compactDisc.addTrack(track1);
		compactDisc.addTrack(track2);
		//compactDisc.removeTrack(track3);
		compactDisc.play();
		List<Media> mediaList = new ArrayList<Media>();
		CompactDisc cd = new CompactDisc("Tuan Anh","Hoang", "Hung", 7, 15f, "hehe");
		cd.addTrack(track1);
		cd.addTrack(track2);
		cd.addTrack(track3);
		DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		mediaList.add(cd);
		mediaList.add(dvd);
		mediaList.add(testBook);
		Collections.sort(mediaList, Media.COMPARE_BY_TITLE_COST);
		for (Media media : mediaList) {
			System.out.println(media);
		}
	}
}

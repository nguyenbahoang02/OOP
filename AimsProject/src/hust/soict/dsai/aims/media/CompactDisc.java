package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
		super(title, category, director, length, cost);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track inputTrack) {
		if(tracks.contains(inputTrack)) {
			System.out.println("The track is already in the CD");
			return;
		}
		tracks.add(inputTrack);
		System.out.println("Track has been added");
	}
	
	public void removeTrack(Track inputTrack) {
		if(tracks.contains(inputTrack)) {
				tracks.remove(inputTrack);
				System.out.println("Track has been removed");
				return;
		}
		System.out.println("The track you trying to remove is not exist");
	}
	
	public int getLength() {
		int sum=0;
		for (Track track : tracks) {
			sum+=track.getLength();
		}
		return sum;
	}
	
	public void play() {
		for (Track track : tracks) {
				track.play();
		}
	}

	@Override
	public String toString() {
		String string = "CD - ";
		string += "[";
		string += getTitle();
		string += "] - [";
		string += getCategory();
		string += "] - [";
		string += getCost();
		string +="$]   track: ";
		int i=0;
		for (Track track : tracks) {
			if(i != 0) {
				string += ", ";
			}
			string += track.getTitle();
			i++;
		}
		return string;
	}
}

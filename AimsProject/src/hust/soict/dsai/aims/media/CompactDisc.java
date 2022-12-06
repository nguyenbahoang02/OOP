package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track inputTrack) {
		for (Track track : tracks) {
			if(track.getTitle().equals(inputTrack.getTitle())) {
				System.out.println("The track is already in the Disc");
				return;
			}
		}
		tracks.add(inputTrack);
		System.out.println("Track has been added");
	}
	
	public void removeTrack(Track inputTrack) {
		for (Track track : tracks) {
			if(track.getTitle().equals(inputTrack.getTitle())) {
				tracks.remove(track);
				System.out.println("Track has been removed");
				return;
			}
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
	
}

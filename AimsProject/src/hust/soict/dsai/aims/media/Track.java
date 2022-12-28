package hust.soict.dsai.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	
	public int getLength() {
		return length;
	}

	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
		
	}
	public void play() {
		
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	public String playString() {
		String str = "";
		str+="Playing DVD: " + this.getTitle();
		str+="\nDVD length: " + this.getLength();
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean a = false;
		if(obj instanceof Track) {
			Track objTrack = (Track)obj;
			if(objTrack.getTitle().equals(this.getTitle())&&objTrack.getLength()==this.getLength()) {
				a = true;
			}
		}
		return a;
	}
}

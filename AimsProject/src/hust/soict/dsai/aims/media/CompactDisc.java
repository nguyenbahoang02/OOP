package hust.soict.dsai.aims.media;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import hust.soict.dsai.aims.exception.PlayerException;

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
	
	public void play() throws PlayerException {
		JDialog jDialog = new JDialog();
		jDialog.setAlwaysOnTop(true);
		jDialog.setSize(200, 150 + (tracks.size()-1)*40);
		jDialog.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.weightx = 1.0;
		constraints.gridx = GridBagConstraints.REMAINDER;
		constraints.insets = new Insets(10, 0, 10, 0);
		for(int i=0;i<tracks.size();i++) {
			if(tracks.get(i).getLength()>0) {
				JLabel jLabel1 = new JLabel("Playing DVD: " + tracks.get(i).getTitle());
				JLabel jLabel2 = new JLabel("DVD length: " + tracks.get(i).getLength());
				jDialog.add(jLabel1, constraints);
				constraints.insets = new Insets(0, 0, 10, 0);
				jDialog.add(jLabel2, constraints);
			}else {
				throw new PlayerException("ERROR: DVD length is non-positive");
			}
		}
		JButton button = new JButton("OK");
		jDialog.add(button, constraints);
		jDialog.setLocationRelativeTo(null);
		jDialog.setVisible(true);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jDialog.setVisible(false);
			}
		});		
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

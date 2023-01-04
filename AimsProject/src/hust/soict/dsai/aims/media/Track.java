package hust.soict.dsai.aims.media;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import hust.soict.dsai.aims.exception.PlayerException;

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
	public void play() throws PlayerException {
		if(getLength()>0) {
			JDialog jDialog = new JDialog();
			jDialog.setAlwaysOnTop(true);
			jDialog.setSize(400, 300);
			jDialog.setLayout(new FlowLayout());
			jDialog.setLocationRelativeTo(null);
			JButton button = new JButton("OK");
			jDialog.add(button);
			jDialog.setVisible(true);
			JLabel jLabel = new JLabel("Playing DVD: " + this.getTitle() + "\nDVD length: " + this.getLength());
			jDialog.add(jLabel);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					jDialog.setVisible(false);
				}
			});		
		}else {
			throw new PlayerException("ERROR: DVD length is non-positive!");
		}
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

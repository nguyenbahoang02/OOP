package hust.soict.dsai.aims.media;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	private String director;
	private int length;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.director = director;
		this.length = length;
		this.setCost(cost);
		this.setId(getCurrentId());
	}
	
	public int getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		return "DVD - [" + this.getTitle() + "] - [" + this.getCategory() + "] - [" + director + "] - ["
				+ length + "] [" + this.getCost() + "$]";
	}
	
	public void play() throws PlayerException {
		if(getLength()>0) {
			JDialog jDialog = new JDialog();
			jDialog.setAlwaysOnTop(true);
			jDialog.setSize(200, 150);
			jDialog.setLayout(new GridBagLayout());
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.weightx = 1.0;
			constraints.gridx = GridBagConstraints.REMAINDER;
			constraints.insets = new Insets(10, 0, 10, 0);
			JLabel jLabel1 = new JLabel("Playing DVD: " + this.getTitle());
			JLabel jLabel2 = new JLabel("DVD length: " + this.getLength());
			jDialog.add(jLabel1, constraints);
			constraints.insets = new Insets(0, 0, 10, 0);
			jDialog.add(jLabel2, constraints);
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
		}else {
			throw new PlayerException("ERROR: DVD length is non-positive");
		}
	}
}

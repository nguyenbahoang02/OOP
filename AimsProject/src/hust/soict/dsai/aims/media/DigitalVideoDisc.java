package hust.soict.dsai.aims.media;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

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
	
	@Override
	public String toString() {
		return "DVD - [" + this.getTitle() + "] - [" + this.getCategory() + "] - [" + director + "] - ["
				+ length + "] [" + this.getCost() + "$]";
	}
	
	public void play() {
		JDialog jDialog = new JDialog();
		jDialog.setAlwaysOnTop(true);
		jDialog.setSize(400, 300);
		jDialog.setLayout(new GridLayout(3, 1));
		JLabel jLabel1 = new JLabel("Playing DVD: " + this.getTitle());
		JLabel jLabel2 = new JLabel("DVD length: " + this.getLength());
		jDialog.add(jLabel1);
		jDialog.add(jLabel2);
		JButton button = new JButton("OK");
		jDialog.add(button);
		jDialog.setLocationRelativeTo(null);
		jDialog.setVisible(true);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jDialog.setVisible(false);
			}
		});		
	}
}

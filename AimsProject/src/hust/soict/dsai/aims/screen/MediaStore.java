package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.renderable.ContextualRenderedImageFactory;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel{
	private Media media;
	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this,  BoxLayout.Y_AXIS));
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		JLabel cost = new JLabel(""+media.getCost()+"$");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		container.add(new JButton("Add to cart"));
		if(media instanceof Playable) {
			JButton playButton = new JButton("Play");
			playButton.addActionListener(new ClickedListener());
			container.add(playButton);
		}
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	private class ClickedListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) { 
//			JDialog jDialog = new JDialog();
//			jDialog.setAlwaysOnTop(true);
//			jDialog.setSize(400, 300);
//			jDialog.setLayout(new FlowLayout());
//			jDialog.setLocationRelativeTo(null);
//			JButton button = new JButton("OK");
//			jDialog.add(button);
//			jDialog.setVisible(true);
//			button.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					jDialog.setVisible(false);
//				}
//			});
//			
			media.play();
		}
	}
}


























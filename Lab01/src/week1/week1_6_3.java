package week1;

import javax.swing.JOptionPane;

public class week1_6_3 {
	public static void main(String[] args) {
		String strN;
		strN = JOptionPane.showInputDialog(null,
				"Enter n: ","Input",
				JOptionPane.INFORMATION_MESSAGE);
		int n = Integer.parseInt(strN);
		for(int i=1;i<n*2;i=i+2) {
			for(int j=0 ;j<((n*2-i)/2);j++) System.out.print(" ");
			for(int j=0;j<i;j++) System.out.print("*");
			for(int j=0 ;j<((n*2-i)/2);j++) System.out.print(" ");
			System.out.print("\n");
		}
	}
}

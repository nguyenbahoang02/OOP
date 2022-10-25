package week1;

import javax.swing.JOptionPane;

public class week1_6_4 {
	public static void main(String[] args) {
		String strMonth = null,strYear;
		int check = 1;
		int year=0;
		int a=28;
		while(check==1) {
			strYear = JOptionPane.showInputDialog(null,
			"Nhap nam: ","Input",JOptionPane.INFORMATION_MESSAGE);
			year = Integer.parseInt(strYear);
			if(year<0) {continue;}
			strMonth = JOptionPane.showInputDialog(null,
			"Nhap thang: ","Input",JOptionPane.INFORMATION_MESSAGE);
			if(year%4==0) {a = 29;}
			switch(strMonth) {
			case "January","Jan.","Jan","1","March","Mar.","Mar","3","May","5","July","Jul","7","August","Aug.","Aug","8","October","Oct.","Oct","10","December","Dec.","Dec","12":
				System.out.println("Thang nay co 31 ngay");
				check = 0;
				break;
			case "April","Apr.","4","June","Jun","6","September","Sept.","Sep","9","November","Nov.","Nov","11":
				System.out.println("Thang nay co 30 ngay");
				check = 0;
				break;
			case "February","Feb.","Feb","2":
				System.out.print("Thang nay co "+a+" ngay");
				check = 0;
				break;
			default:
				System.out.println("Ban nhap khong hop le, vui long nhap lai");
				check = 1;
				break;
		}
		}
	}
}

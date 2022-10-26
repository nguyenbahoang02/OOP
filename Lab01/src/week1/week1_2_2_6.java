package week1;

import javax.swing.JOptionPane;
import java.lang.Math; 

public class week1_2_2_6 {
	public static void main(String[] args) {
		String strMenu;
		strMenu = JOptionPane.showInputDialog(null, 
				"Giai phuong trinh bac 1: 1\nGiai he phuong trinh: 2\nGiai phuong trinh bac 2: 3 ", "Menu",
				JOptionPane.INFORMATION_MESSAGE);
		int menu = Integer.parseInt(strMenu);
		if(menu == 1) {
			String strNum1,strNum2;
			strNum1 = JOptionPane.showInputDialog(null,
					"ax+b=0","Nhap vao a:",
					JOptionPane.INFORMATION_MESSAGE);
			strNum2 = JOptionPane.showInputDialog(null,
					"ax+b=0","Nhap vao b:",
					JOptionPane.INFORMATION_MESSAGE);
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			if(num1==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}else {
				double nghiem = -num2/num1;
				System.out.println("Nghiem cua phuong trinh la x= " + nghiem);
			}
		}else if(menu == 2) {
			String strNum1,strNum2,strNum3,strNum4,strNum5,strNum6;
			strNum1 = JOptionPane.showInputDialog(null,
					"a1x + b1y = c1\na2x + b2y = c2","Nhap vao a1:",
					JOptionPane.INFORMATION_MESSAGE);
			strNum2 = JOptionPane.showInputDialog(null,
					"a1x + b1y = c1\na2x + b2y = c2","Nhap vao b1:",
					JOptionPane.INFORMATION_MESSAGE);
			strNum3 = JOptionPane.showInputDialog(null,
					"a1x + b1y = c1\na2x + b2y = c2","Nhap vao c1:",
					JOptionPane.INFORMATION_MESSAGE);
			strNum4 = JOptionPane.showInputDialog(null,
					"a1x + b1y = c1\na2x + b2y = c2","Nhap vao a2:",
					JOptionPane.INFORMATION_MESSAGE);
			strNum5 = JOptionPane.showInputDialog(null,
					"a1x + b1y = c1\na2x + b2y = c2","Nhap vao b2:",
					JOptionPane.INFORMATION_MESSAGE);
			strNum6 = JOptionPane.showInputDialog(null,
					"a1x + b1y = c1\na2x + b2y = c2","Nhap vao c2:",
					JOptionPane.INFORMATION_MESSAGE);
			double a1 = Double.parseDouble(strNum1);
			double b1 = Double.parseDouble(strNum2);
			double c1 = Double.parseDouble(strNum3);
			double a2 = Double.parseDouble(strNum4);
			double b2 = Double.parseDouble(strNum5);
			double c2 = Double.parseDouble(strNum6);
			double d = a1*b2-a2*b1;
			double dx = c1*b2 - c2*b1;
			double dy = a1*c2 - a2*c1;
			if(d==0 && dx==0 && dy==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}else if(d==0&&(dx!=0 || dy!=0)){
				System.out.println("Phuong trinh vo nghiem");
			}else {
				double x = dx/d;
				double y = dy/d;
				System.out.println("Nghiem cua phuong trinh la: \nx= "+ x +"\ny= "+ y);
			}
		}else if(menu==3) {
			String strNum1,strNum2,strNum3;
			strNum1 = JOptionPane.showInputDialog(null,
					"ax^2 + bx + c = 0","Nhap vao a:",
					JOptionPane.INFORMATION_MESSAGE);
			strNum2 = JOptionPane.showInputDialog(null,
					"ax^2 + bx + c = 0","Nhap vao b:",
					JOptionPane.INFORMATION_MESSAGE);
			strNum3 = JOptionPane.showInputDialog(null,
					"ax^2 + bx + c = 0","Nhap vao c:",
					JOptionPane.INFORMATION_MESSAGE);
			double a = Double.parseDouble(strNum1);
			double b = Double.parseDouble(strNum2);
			double c = Double.parseDouble(strNum3);
			double delta = b*b - 4*a*c;
			if(delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}else if(delta ==0 ) {
				double x = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep x = " + x);
			}else {
				double x1 = (-b + Math.sqrt(delta))/(2*a);
				double x2 = (-b - Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co 2 nghiem\nx1 = " + x1 + "\nx2= " + x2);
			}
		}
	}
}

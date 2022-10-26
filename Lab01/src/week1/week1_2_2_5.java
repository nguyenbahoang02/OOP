package week1;

import javax.swing.JOptionPane;

public class week1_2_2_5 {
	public static void main(String[] args) {
		String strNum1,strNum2;
		boolean check = true;
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		if(num2==0) { 
			check = false;
		}
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1*num2;
		double quotient = num1/num2;
		System.out.println("The sum of the 2 numbers is " + sum);
		System.out.println("The difference of the 2 numbers is " + difference);
		System.out.println("The product of the 2 numbers is " + product);
		if(check == true) {
			System.out.println("The quotient of the 2 numbers is " + quotient);
		}else {
			System.out.println("The divisor is 0");
		}
	}
}

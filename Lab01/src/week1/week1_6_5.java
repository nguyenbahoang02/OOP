package week1;

import java.util.Arrays;
import java.util.Scanner;

public class week1_6_5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = keyboard.nextInt();
		double[] array = new double[n];
		for(int i=0;i<n;i++) {
			System.out.print("Nhap phan tu ");
			System.out.println(i+1);
			array[i]=keyboard.nextDouble();
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}

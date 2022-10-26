package week1;

import java.util.Arrays;
import java.util.Scanner;

public class week1_6_5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = keyboard.nextInt();
		double sum=0;
		double average=0;
		double[] array = new double[n];
		for(int i=0;i<n;i++) {
			System.out.print("Nhap phan tu ");
			System.out.println(i+1);
			array[i]=keyboard.nextDouble();
			sum += array[i];
			average = average + array[i]/n;
		}
		Arrays.sort(array);
		System.out.println("Mang sau khi sap xep la: ");
		System.out.println(Arrays.toString(array));
		System.out.println("Tong cac phan tu cua mang la: " + sum);
		System.out.println("Trung binh cac phan tu cua mang la " + average);
	}
}

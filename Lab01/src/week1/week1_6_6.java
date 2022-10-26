package week1;

import java.util.Arrays;
import java.util.Scanner;

public class week1_6_6 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap so hang cua ma tran: ");
		int m = keyboard.nextInt();
		System.out.println("Nhap so cot cua ma tran: ");
		int n = keyboard.nextInt();
		double[][] a = new double[m][n];
		double[][] b = new double[m][n];
		System.out.println("Nhap vao ma tran A");
		for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]= keyboard.nextDouble();
			}
		}
		System.out.println("Nhap vao ma tran B");
		for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]= keyboard.nextDouble();
			}
		}
		double[][] c = new double[m][n];
		for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("Tong 2 ma tran la: ");
		for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}

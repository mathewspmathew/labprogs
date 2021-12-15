import java.io.*;
import java.util.Scanner;


public class Matrix {
public static void main(String args[])
{
	int a[][]=new int[10][10];
	int b[][]=new int[10][10];
	int c[][]=new int[20][20];
	int m1,m2,n1,n2;
	int i,j,k;
	
	Scanner sc=new Scanner(System.in);
//	void read()
//	{
//		Scanner sc=new Scanner(System.in);
//		int i,int j;
//		int k=1;
//		
//		System.out.println("enter the row and colom of"+ k +"matrix");
//		int m=sc.nextInt();
//		int n=sc.nextInt();
//		for(i=0;i<m;i++) {
//			for(j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//	}
System.out.println("For the first matrix");
System.out.println("enter the row and colom of first matrix");
m1=sc.nextInt();
n1=sc.nextInt();
System.out.println("row elements");
for(i=0;i<m1;i++) {
	for(j=0;j<n1;j++) {
		a[i][j]=sc.nextInt();
		}}
		
System.out.println("For the second matrix");
System.out.println("enter the row and colom of first matrix");
m2=sc.nextInt();
n2=sc.nextInt();
System.out.println("row elements");
for(i=0;i<m2;i++) {
	for(j=0;j<n2;j++) {
		b[i][j]=sc.nextInt();

}
}
int multi=0;
	for(i=0;i<m1;i++) {
		for(j=0;j<n2;j++) {
			for(k=0;k<n1;k++) {
				multi=multi+(a[i][k]*b[k][j]);
			}
			c[i][j]=multi;
		}
	}
	System.out.println("the multiplied matrix");
	
	for(i=0;i<m1;i++) {
		for(j=0;j<n2;j++) {
			System.out.print(c[i][j]);
			
		}
		System.out.println();
	}
	
	}}

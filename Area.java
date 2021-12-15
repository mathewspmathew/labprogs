import java.io.*;
import java.util.Scanner;

class Cal{
	void Cal(int l,int b) {
		
		int area= l*b;
		System.out.println(area);
		
	}
	void Cal(double d) {
		double area = 3.14*d*d;
		System.out.println(area);
	}
	void Cal(double b,double h) {
		double area= 0.5*b*h;
		System.out.println(area);
	}
}
public class Area{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Cal ar=new Cal();
		System.out.println("enter the shape to found the area");
		System.out.println("if Area is circle- 1");
		System.out.println("if Area is rect  - 2");
		System.out.println("if are is  triangle -3");
		System.out.println();
		int c=sc.nextInt();
		if(c==1) 
		{
			System.out.println("enter the radius of cirle");
			double rad=sc.nextDouble();
			ar.Cal(rad);
			
		}
		else if(c==2) {
			System.out.println("enter the lenght and breadth of rect");
			int l=sc.nextInt();
			int b=sc.nextInt();
			ar.Cal(l,b);
		}
		else if(c==3) 
		{
			System.out.println("enter the base and height of triangle");
			double b=sc.nextDouble();
			double h=sc.nextDouble();
			ar.Cal(b,h);
		}
		else
			System.out.println("invalid input");
		
	}
	
}
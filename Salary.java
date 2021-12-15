import java.io.*;
import java.util.Scanner;


class Employee{
	
	void display() {}
	void Calc(int BS,int DA,int HRA) {
		int GS=BS+(BS*(DA/100))+(BS*(HRA/100));
		System.out.println("gross salary is "+GS);
	}
	
}
class Engineer extends Employee {
	
	void accept(int BS,int DA,int HRA)
	{
		Calc(BS,DA,HRA);
	}
	
}


public class Salary {
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Engineer eg=new Engineer();
	
	System.out.println("enter the basic slary");
	int ba=sc.nextInt();	
	System.out.println("enter the DA of engineer");
	int da=sc.nextInt();
	System.out.println("enter the HRA of engineer");
	int hra=sc.nextInt();
	
	eg.accept(ba, da, hra);
}
}

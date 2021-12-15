package programs;

/*
 * Author: 		Mathews P Mathew
 * Prog:		Check if a string is palindrome or not
 * 
 * */


import java.util.Scanner;

public class Palindrome {
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int i;String s2="";
	System.out.println("enter the string");
	String s=sc.next();
	
	int len=s.length();
	System.out.println(len);
	for(i=len-1;i>=0;i--) {
		s2=s2+s.charAt(i);
	}
	if(s.equals(s2)) {
	System.out.println("palindrome");
}
	else
		System.out.println("not a palindrome");
}}

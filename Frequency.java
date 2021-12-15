/*
 * Author: 		Mathews P Mathew
 * Prog:		Finding frequency of a letter in a string
 * 
 * */
import java.util.Scanner;
public class Frequency {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int freq=0;
		int i;
		System.out.println("enter the string for the frequency check");
		String s=sc.nextLine();
		
		System.out.println("enter the character to check the frequency");
		char c=sc.next().charAt(0);
		
		int len=s.length();
		
		for(i=0;i<len;i++) {
			
			if(s.charAt(i)==c)
				freq++;
		}
		System.out.println("the "+c+" has "+freq +"in the given string ");
	}
}

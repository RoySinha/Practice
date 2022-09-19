package ApiService;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the string"); //getting string input 
		String entry= Sc.nextLine(); // fetching the string value entered
		int Strlen = entry.length();
		
		String revstr=""; //Variable to store the reverse of the string
		for (int i= Strlen-1; i>=0 ; i--) {
			
			revstr = revstr + entry.charAt(i);
			
		}
		
		if(entry.contentEquals(revstr)) {
			
			System.out.println("The String is a Palindrome");
		}
		else {
		System.out.println("The String is NOT a Palindrome");
		}
		

	}
	

}

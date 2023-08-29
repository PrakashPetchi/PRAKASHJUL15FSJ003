package labbook;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter your Favourite Number:");
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		if(num%2 == 0)
			System.out.println("Your number is even");
		else
			System.out.println("Your number is odd");
		System.out.println("\n");
		System.out.println("Enter your favourite letter: ");
		
		char c;
		c = scan.next().charAt(0);
		
				
		if( c == 'a' || c == 'e' || c =='i' || c == 'o' || c =='u')
			System.out.println("It is an vowel");
		else
			System.out.println("It is not an Vowel");
		
		
			

	}

}

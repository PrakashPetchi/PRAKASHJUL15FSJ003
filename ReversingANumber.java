package labbook;

import java.util.Scanner;

public class ReversingANumber {

	public static void main(String[] args) {
		int num=0;
		int reversnum =0;
		System.out.println("Enter a number : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		while( num != 0 )
		{
		reversnum = reversnum * 10;
		reversnum = reversnum + num%10;
		num = num/10;
		}
		System.out.println("Your number is: "+ reversnum);
	

	}

}

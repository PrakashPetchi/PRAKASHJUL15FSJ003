package labbook;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50, 10};
		int sum = 0;
		for( int num : array) {
		sum = sum+num;
		}
		System.out.println("Sum of array elements is:"+sum);
		
		Scanner scan = new Scanner(System.in);
		int[] array1 = new int[10];
		int sum1 = 0;
		System.out.println("Enter the numbers:");
		for (int i=0; i<10; i++)
		{
		array[i] = scan.nextInt();
		}
		for( int num : array1) {
		sum = sum1+num;
		}
		System.out.println("Sum of array elements is:"+sum);
	}

}

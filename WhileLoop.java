package labbook;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] agrs) {
		
		int num;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = scan.nextInt();
		
		while (num < 10) {
			sum = sum + num;
			num++;
		}
		System.out.println("Sum of the Numbers: " + sum);
		
		System.out.println("\n");
		
		int i = 1;
				 do  {
	
					System.out.println("The value i is "+ i);
					System.out.println("\n");
					i++;
					
				}while(i<=15);
		
		}
	}

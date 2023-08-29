package labbook;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int a,b;
		char operator;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number : ");
		a = scan.nextInt();
		System.out.println("Enter your second Number :");
		b = scan.nextInt();
		System.out.println("Enter the operator +, -");
		operator = scan.next().charAt(0);		
		switch(operator) {
		case '+':{
			System.out.println("Your value is " +(a+b));
			break;
			
		}
		case '-':{
			System.out.println("Your value is " +(a-b));
			break;
		}
		default:{
			System.out.println("Wrong Operator");
		}
		}
	int x = 2;
	int y = 2;
	
	switch(x) {
	case 1:
		System.out.println("java");
		break;
	case 2:
		switch(y) {
		case 1:
			System.out.println("java");
		break;
		
		case 2:
			System.out.println("c++");
			
		}
	}

	}

}

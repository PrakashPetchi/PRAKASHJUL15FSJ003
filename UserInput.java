package labbook;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = reader.nextInt();
		System.out.println("Your age is ="+ age);
		
		System.out.println("Enter a first number =");
		int i = reader.nextInt();
		
		System.out.println("Enter your second number =");
		int j = reader.nextInt();
		
		System.out.println(("Multiplication of two numbers are =")+ i*j);
		}
}
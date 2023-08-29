package labbook;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value for the length of Rectangle:");
		double length = scan.nextDouble();
		System.out.println("Enter a value for the width of Rectangle:");
		double width = scan.nextDouble();
		double area = length * width;
		System.out.println("Area of Rectangle is: " + area);
	}

}

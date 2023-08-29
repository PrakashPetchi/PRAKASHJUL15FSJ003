package labbook;

public class Typecasting {

	public static void main(String[] args) {
		byte b = 10;
		int i = b;
		//byte c= i;
		byte d =(byte)i;
		
		byte x = 10;
		byte y = 20;
		int z = x*y;
		System.out.println("The value of Z = " + z);
		
	char c = 'H';
	int g = c;
	int k = (char)c;
	System.out.println("The value of "+ c + " is " + g);
	System.out.println("The value of "+ c + " is " + k);
	
	

	}

}

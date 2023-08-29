package labbook;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i =0;
		int num =0;
		String primeNumbers = "";
		for (i = 1; i <= 100; i++)
		{
		int x=0;
		for(num =i; num>=1; num--)
		{
		if(i%num==0)
		{
		x = x + 1;
		}
		}
		if (x ==2)
		{
		primeNumbers = primeNumbers + i + " ";
		}
		}
		System.out.println("Prime numbers before 100 are : "+primeNumbers);
		
		
		

	}

}

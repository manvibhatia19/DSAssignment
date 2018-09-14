import java.util.*;
public class fiboCalc
{ 
	public static void main(String args[]) 
	{
		System.out.println("enter no. upto which fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("fibonacci series upto " + number +" numbers : ");
		for(int i=1; i<=number; i++)
		{ 
			System.out.print(fibonacci(i)+" "); 
		} 
	} 
	public static int fibonacci(int number)
	{ 
		if(number == 1 || number == 2)
		{ 
			return 1; 
		} 
		return fibonacci(number-1) + fibonacci(number -2);
	}
}
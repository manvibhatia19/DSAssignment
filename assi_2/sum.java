import java.util.*;
class sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.: ");
		String str=sc.nextLine();
		int num=Integer.parseInt(str);
		int sum=calc(num);
		System.out.println("sum of digits is: "+sum);
	}
	public static int calc(int num)
	{
		if(num==0)
		{
			return 0;
		}
		else
		{
			int sum=(num%10)+calc(num/10);
			return sum;
		}
	}
}
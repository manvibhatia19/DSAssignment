import java.util.*;
class power
{
	public static void main(String args[])
	{
		System.out.println("enter x and y for x^y: ");
		int x=new Scanner(System.in).nextInt();
		int y=new Scanner(System.in).nextInt();
		int ans=calc(x,y);
		System.out.println("ans is: "+ans);

	}
	public static int calc(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		int ans=x*calc(x,--y);
		return ans;
	}
}
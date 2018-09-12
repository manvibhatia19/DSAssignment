import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string: ");
	String str=sc.nextLine();
	String res=stringReverse(str);
	System.out.println(res);
}
		public static String stringReverse(String str)
		{
			int i=0;
			int j=str.length()-1;
			while(j>i)
			{
				if(str.charAt(i++)!=str.charAt(j--))
				{
					return "false";
				}
			}
		return "true";
	}
}
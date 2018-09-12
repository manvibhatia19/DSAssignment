import java.util.*;
class substring
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a string: ");
  		String str=sc.nextLine();
  		System.out.println("all substrings are: ");
      subStr(str);
 	}
  public static void subStr(String str)
  {
    for (int i = 0; i < str.length(); i++)
      {
        for (int j = i+1; j <= str.length(); j++)
        {
            System.out.print(str.substring(i,j)+" ");
        }
        System.out.println();
    }
  }
}
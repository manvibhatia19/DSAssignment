import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("reversed array is: ");
		reverse(0,n,arr);
	}
	public static void reverse(int i,int n, int arr[])
	{
		if(i==n)
		{
			return ;
		} 
		else
		{
			reverse(i+1, n, arr);
		    System.out.print(arr[i]+" ");
		}
	}
}
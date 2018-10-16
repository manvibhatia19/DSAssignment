import java.util.*;
class containValue
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
		System.out.println("enter no. to search: ");
		int m=sc.nextInt();
		boolean ans=search(arr,m);
		System.out.println(ans);
	}
	public static boolean search(int arr[], int num)
	{
		if(arr.length==0)
		{
			return false;
		}
		if(arr[0]==num)
		{
			return true;
		}
		int smallArr[]=new int[arr.length-1];
		for(int i=0;i<smallArr.length;i++)
		{
			smallArr[i]=arr[i+1];
		}
		return search(smallArr,num);
	}
}
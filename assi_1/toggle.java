import java.util.*;
public class toggle
{
public static void main(String[] args)
    {
      System.out.println("Enter a string: "); 
      Scanner sc = new Scanner(System.in); 
      String str = sc.nextLine(); 
      System.out.println("toggled string:" + toggleString(str));
    }
    public static String toggleString(String str)
    {
      String tog = ""; 
      for(int i=0; i<str.length(); i++)
      {
        char ch = str.charAt(i); 
        if(Character.isUpperCase(str.charAt(i)))
        {
          ch = Character.toLowerCase(ch); 
          tog = tog + ch; 
        }
        else if(Character.isLowerCase(str.charAt(i)))
        {
          ch = Character.toUpperCase(ch);
          tog = tog + ch; 
        }
       }
      return tog;
    }
}
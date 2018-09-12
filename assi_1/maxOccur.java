import java.util.*;
public class maxOccur
{
    static char maxOccuringChar(String str)
    {
        int count[] = new int[256];
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = sc.nextLine();
        System.out.println("Max occurring char is: "+maxOccuringChar(str));
    }
}
import java.util.*;
import java.lang.*;
public class c_palindrom
{
    public static void main(String args[])
    {
        String str="carerac";
        System.out.println(palindrom(str));
    }
    public static boolean palindrom(String str)
    {
        for(int n=0; n<str.length()/2 ; n++)       // 
        {
            int m=str.length();
            if(str.charAt(n) != str.charAt(m-1-n))
            {
                return false;
            }
        }
        return true;
    }
}

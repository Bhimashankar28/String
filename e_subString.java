import java.util.*;
public class e_subString
{
    public static void main(String args[])
    {
        String str="hey ash, how are you";
        System.out.println(subString(str,11,15));
    }
    public static String subString(String str ,int fi,int si)
    {
String substr="";
for(int i=fi; i<si; i++)
{
    substr += str.charAt(i);
}
return substr;
    }
}

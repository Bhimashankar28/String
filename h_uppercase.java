import java.util.*;
public class h_uppercase
{
    public static String toUpperCase(String str)
    {
        StringBuilder sb=new StringBuilder(" ");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int j=1; j<str.length(); j++)
        {
            if(str.charAt(j) == ' ' && j<str.length()-1)
            {
                sb.append(str.charAt(j));
                j++;
                sb.append(Character.toUpperCase(str.charAt(j)));
            }
            else {
                sb.append(str.charAt(j));
            }
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
        String str="hey its ashish";
        System.out.println(toUpperCase(str));
    }
}

import java.util.*;
public class g_a_to_z
{
 public static void main(String args[])
 {
     StringBuilder sb=new StringBuilder("");
     for(char ch='a'; ch<='z'; ch++)
     {
         sb.append(ch);
     }
     System.out.println(sb);
     System.out.println("Length is:"  +  sb.length());
 }
}

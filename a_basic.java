/*
Sting are immutable(we cant change )
1-String str=new String("abcd");
2-String str={'a','b','c','d'};
3-for input use .next();   it take just one word
4-.nextline();     it take hole word
5- for finding length we use .length();    method      it also count spaces in the word
6- .charAt(number);
 */


import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
public class a_basic
{
    public static void main(String args[])
    {
        char[] str={'a','b','c','d'};
        String str1=new String(str);
        System.out.println(str1);

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        System.out.println(name + " Length="  + name.length()    +" charater " + name.charAt(2));


    }
}

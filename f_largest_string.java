/*
str().compareTo()=use for comparing 2 string
 */

import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
public class f_largest_string
{
    public static void main(String args[])
    {
        String str []={"Apple", "Banana", "Carret"};
        String largest=str[0];
        for(int i=0; i<str.length;i++)
        {
            if (largest.compareTo(str[i]) < 0)
            {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

}

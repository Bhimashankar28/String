import java.lang.*;
public class b_print_char
{
    public static void main(String args[])
    {
        String name = " hey ashish, how are you";
        print(name);
    }

    public static void print(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            System.out.println( str.charAt(i) );
        }

    }
}

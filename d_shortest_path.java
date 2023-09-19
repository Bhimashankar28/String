import java.lang.*;
public class d_shortest_path
{
    public static void main(String args[])
    {
         String str="wneenesennn";
        System.out.println(getShortestPath(str));
    }
    public static int getShortestPath(String str)
    {
        int x=0, y=0;
        for(int i=0; i<str.length(); i++)
        {
            char dir=str.charAt(i);
            //south
            if(dir == 's')
            {
                y--;
            }
            //north
            else if(dir == 'n')
            {
                y++;
            }
            else if(dir == 'w')
            {
                x--;
            }
            else
            {
               x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (int)Math.sqrt(X2 + Y2);
    }
}

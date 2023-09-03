import java.io.*;
import java.util.*;
public class test
{
    static int max(int a, int b)
    {
        if (a>b)
        return a;
        else
        return b;
    }
    public static void main (String[]argh)
    {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=max(a,b);
        System.out.println(c);
        
    }
}


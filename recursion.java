import java.util.*;
import java.io.*;
public class recursion
{
    public static void main (String [] argh)
    {
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    printdec(n);
    
    
    
    
    
        
    }
    public static void printdec(int d)
    {
        if(d==0)
        return;
        else
        {
            System.out.println(d);
            printdec(d-1);
        }
        
    }
}

import java.util.*;
import java.io.*;
public class increasing
{
    public static void main (String [] argh)
    {
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    printinc(n);
    
    
    
    
    
        
    }
    public static void printinc(int d)
    {
        if(d==0)
        return;
        printinc(d-1);
        System.out.println(d);
    }
}
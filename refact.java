import java.util.*;
import java.io.*;
public class refact
{
    public static void main (String [] argh)
    {
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    int f=printfact(n);
    System.out.println(f);
    
    
    
    
    
        
    }
    public static int printfact(int d)
    {
        if(d==1)
        return 1;
        
        
          int p=printfact(d-1);
          int s=d*p;
          return s;
        
        
    }
}
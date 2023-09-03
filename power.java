import java.util.*;
import java.io.*;
public class power
{
    public static void main (String [] argh)
    {
    Scanner in=new Scanner (System.in);
    int x=in.nextInt();
    int n=in.nextInt();
    
    int ans=printpow(x,n);
    
    System.out.println(ans);
    
    
    
        
    }
    public static int printpow(int x,int n)
    {
        if(n==0)
        return 1;
        int nm1=printpow(x,n-1);
        int nm=x*nm1;
        return nm;
    }
}
import java.io.*;
import java.util.*;
public class primeMethod 
{
    static void prime(int n)
    {
        int status=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            status=status+1;
        }
        if(status==1)
        System.out.println("no is prime");
        else
        System.out.println("no is not prime");
    }
    public static void main(String[]argh)
    {
        Scanner in =new Scanner (System.in);
        int a=in.nextInt();
        prime(a);
    }
    
    
    
    
    
    
    
    
}
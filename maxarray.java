import java.io.*;
import java.util.*;
public class maxarray
{
    static int max(int n[])
    {
        int max=n[0];
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>max)
            max=n[i];
            
        }
        return max;
    }
    public static void main(String[]argh)
    {
        Scanner in =new Scanner (System.in);
        int n[]=new int[5];
        for(int i=0;i<n.length;i++)
        n[i]=in.nextInt();
        int max=max(n);
        System.out.println(max);
        
    }
}

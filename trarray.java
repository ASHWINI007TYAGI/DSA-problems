import java.util.*;
import java.io.*;
public class trarray
{
    public static void main (String [] argh)
    {
    Scanner in=new Scanner (System.in);
    int arr[]={1,2,3,4,5};
    int n=arr.length-1;
    loda(arr , n);
    
    
    
    
        
    }
    public static void loda(int[] arr,int n)
    {
        if(n<0)
        {
        
        return;
    }
    
        loda(arr,n-1);
        System.out.println(arr[n]);
        
        return ;
    }
}
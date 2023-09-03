import java.io.*;
import java.util.*;
class Leapyear
{
    public static void main(String[]argh)
    {
        Scanner in=new Scanner (System.in);
        System.out.println("enter the year");
        int num=in.nextInt();
        if(num%4==0)
        {
            if(num%100==0&&num%400==0)
            System.out.println("LEAP YEAR");
            
            
        }
        
        else
            System.out.println("NOT LEAP YEAR");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
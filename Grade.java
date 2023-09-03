import java.io.*;
import java.util.*;
class Grade
{
    public static void main(String[]argh)
    {
        Scanner in=new Scanner (System.in);
        System.out.println("enter the percent");
        int num=in.nextInt();
        if(num>95)
        System.out.println("FIRST");
        
        if(num<95&&num>75)
        System.out.println("SECOND");
        if(num<75&&num>50)
        System.out.println("THIRD");
        if(num<50&&num>0)
        System.out.println("FAIL");
        
        
        
    }
}

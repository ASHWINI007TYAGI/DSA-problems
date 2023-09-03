import java.io.*;
import java.util.*;
class Weekdays
{
    public static void main(String[]argh)
    {
        Scanner in=new Scanner (System.in);
        System.out.println("enter the number");
        int num=in.nextInt();
        if(num==1)
        System.out.println("MONDAY");
        if(num==2)
        System.out.println("TUESDAY");
        if(num==3)
        System.out.println("WEDNESDAY");
        if(num==4)
        System.out.println("THURSDAY");
        if(num==5)
        System.out.println("FRIDAY");
        if(num==6)
        System.out.println("SATURDAY");
        if(num==7)
        System.out.println("SUNDAY");
        if(num==0||num>7)
        System.out.println("INVALID INPUT!");
    }
}
import java.io.*;
import java.util.*;
class oddeven
{
    public static void main(String[]argh)
    {
        Scanner in=new Scanner (System.in);
        System.out.println("enter the number");
        int num=in.nextInt();
        if (num%2==0)
        System.out.println("EVEN");
        if (num%2!=0)
        System.out.println("ODD");
            }
}
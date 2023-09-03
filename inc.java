import java.util.*;
import java.io.*;
public class inc
{
    public static void main (String [] argh)
    {
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    printdec(n);  
    }
    public static void printdec(int d)
    {
        if(d==0)
        return;
        System.out.println(d);
        printdec(d-1);
        System.out.println(d);
    }
}
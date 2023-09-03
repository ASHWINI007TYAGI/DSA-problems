import java.io.*;
import java.util.*;

public class print {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        printDecreasing(n);
        // write your code here
    }

    public static void printDecreasing(int n){
        if(n==0)
        return;
        else{
            System.out.println(n);
            printDecreasing(n-1);
        }
        
    }

}
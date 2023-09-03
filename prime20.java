import java.util.*;
public class prime20
{
    public static void main(String[]argh)
    {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int status=0;
        int count=0;
        System.out.print("the "+n+" prime numbers are 1 2");
        
            for(int j=3;j<100;j++)
            {
                for(int k=2;k<j;k++)
                {
                    if(j%k==0)
                    {
                        
                        status=1;
                        break;
                    }
                }
                if(status==0)
                {
                System.out.print(" "+j+" ");
                count=count+1;
            }
            if(count==n-2)
            break;
            status=0;
            }
        
    }
}

class Reverse
{
    public static void main(String[]argh)
    {
        
        System.out.println("enter the number");
        int num=456;
        int tnum=num;
        if(num<10)
        System.out.println(num);
        else
        {
            while(num>10)
            {
                int temp=num%10;
                num=num/10;
                System.out.print(temp);
            }
            System.out.print(num);
        }
        
    }
}
class prime
{
    public static void main(String[]argh)
    {
        int num=7;int t=0;
        for(int i=1;i<4;i++)
        {
            if(num%i!=0)
            {
                t=1;
            }
        }
        if(t==1)
        System.out.println("number is prime");
    }
}
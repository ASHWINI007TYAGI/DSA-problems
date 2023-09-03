class odd
{
    public static void main (String[]argh)
    {
        int num=20;
        int numd=num*2;
        System.out.println("the first twenty odd numbers are");
        for (int i=0;i<numd+1;i++)
        {
            if(i%2!=0)
            System.out.println(i);
        }
    }
}
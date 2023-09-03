class sumavg
{
    public static void main(String[]argh)
    {
        float num=10;
        float sum=0;
        for(int i=0;i<11;i++)
        {
            sum=i+sum;
        }
        float avg=sum/10;
        System.out.println("SUM IS = "+sum);
        System.out.println("AVG IS = "+avg);
    }
}
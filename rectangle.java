class rectangle
{
    private int length;
    private int breadth;
    public rectangle()
    {
        length=1;
        breadth=1;
    }
    public rectangle(int l,int b)
    {
        length=5;
        breadth=5;
    }
    public void area()
    {
        System.out.println(length*breadth);
    }
    public static void main (String[]argh)
    {
        rectangle r=new rectangle();
        rectangle r1=new rectangle(5,5);
        r.area();
        r1.area();
    }
}
class rectangle
{
    int length;
    int breadth;
    public int area()
    {
        int area=length*breadth;
        return area;
    }
    public int perimeter()
    {
        int perimeter=2*(length+breadth);
        return perimeter;
    }
     public boolean isSqure()
    {
        if(length==breadth)
        return true;
        else 
        return false;
    }
}
public class first
{
    public static void main(String[]argh)
    {
        rectangle r1=new rectangle();
        r1.length=2;
        r1.breadth=2;
        int area=r1.area();
        int peremeter=r1.perimeter();
        boolean square=r1.isSqure();
        if(square==true)
        System.out.println("it is a square");
        else
        System.out.println("not a square");
        System.out.println("perimeter is "+peremeter);
        System.out.println("area is"+area);
        
        
    }
}
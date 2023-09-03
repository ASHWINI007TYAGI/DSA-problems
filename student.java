public class student
{
    public String name;
    public int  age;
    public int rollno;
    
    
     
    public static void main(String[]argh)
    {
        student s1=new student();
        s1.name="vishal";
        s1.age=18;
        s1.rollno=12;
        student s2=new student();
        s2.name="vishal";
        s2.age=18;
        s2.rollno=1;
        System.out.println(s1.name+" "+" "+s1.rollno);
        System.out.println(s2.name+" "+" "+s2.rollno);
        
    }
}
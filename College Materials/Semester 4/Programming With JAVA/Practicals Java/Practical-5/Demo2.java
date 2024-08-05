//Practical-5(2.1)
// Java program to demonstrate accessing
// a static nested class
// outer class
class OuterClass
{
    static int outer_x = 10;
    int outer_y = 20;
    private static int outer_private = 30;
    static class StaticNestedClass
    {
        void display()
        {
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_private = " + outer_private);
        }
    }
}
public class Demo2
{
    public static void main(String[] args)
    {
        OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
        obj.display();
    }
}

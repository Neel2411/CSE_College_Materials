//Practical-5(2.3)
// Java program to demonstrate Need for
// Anonymous Inner class
// Interface
interface Age
{
    int x = 21;
    void getAge();
}
class MyClass implements Age
{
    public void getAge()
    {
        System.out.print("Age is " + x);
    }
}
// Main class
// AnonymousDemo
class GFG
{
    public static void main(String[] args)
    {
        MyClass obj = new MyClass();
        obj.getAge();
    }
}

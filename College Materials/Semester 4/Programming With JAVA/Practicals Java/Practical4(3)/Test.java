class T
{
    public void print(String s)
    {
        System.out.println(s);
    }
}
interface GeometricShape
{
     void describe();
}
interface TwoDShape extends GeometricShape
{
     double area();
}
interface ThreeDShape extends GeometricShape
{
    double volume();
}
class Cone implements ThreeDShape
{
    T q = new T();
    private double radius;
    private double height;
    public Cone (double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double volume()
    {
        double vol = (1/3f) * 3.14 * radius * radius * height;
        q.print("--------------------------------------------------------");
        q.print("CONE");
        q.print("--------------------------------------------------------");
        System.out.printf("The Volume Of The Cone Is         : %.2fm³\n",vol);
        return 1;
    }
    public void describe()
    {
        q.print("DEFINITION : The Cone Is A Solid Or Hollow Object Which " +
                "\n             Tapers From A Circular Or Roughly Circular " +
                "\n             Base To A Point.");
    }
}
class rectangle implements TwoDShape {
    T q = new T();
    private double width, height;
    public rectangle (double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public double area()
    {
        double a = width * height;
        q.print("--------------------------------------------------------");
        q.print("RECTANGLE");
        q.print("--------------------------------------------------------");
        q.print("The Area Of The Rectangle Is      : "+a+"m³");
        return 1;
    }
    public double perimeter()
    {
        double p = 2 * (width + height);
        q.print("The Perimeter Of The Rectangle Is : "+p+"m³");
        return 1;
    }
    public void describe()
    {
        q.print("DEFINITION : The Rectangle Is A Plane Figure With Four " +
                "\n             Straight Sides & Four Right Angles," +
                "\n             Especially One With Unequal Adjacent Sides.");
    }
}
class Sphere implements ThreeDShape {
    T q = new T();
    private double radius;
    public Sphere (double radius)
    {
        this.radius = radius;
    }
    public double volume() {
        double vol = (4/3f) * 3.14 * radius * radius * radius;
        q.print("--------------------------------------------------------");
        q.print("SPHERE");
        q.print("--------------------------------------------------------");
        System.out.printf("The Volume Of The Sphere Is       : %.2fm³\n",vol);
        return 1;
    }
    public void describe()
    {
        q.print("DEFINITION : The Sphere Is A Round Solid Figure, Or " +
                "\n             Its Surface, With Every Point On Its " +
                "\n             Surface Equidistant From Its Centre.");
		q.print("--------------------------------------------------------");
		q.print("************************* END **************************");
		q.print("--------------------------------------------------------");
    }

}
public class Test {
    public static void main(String[] args) {
        Cone c = new Cone(3, 3);
        rectangle r = new rectangle(2, 2);
        Sphere s = new Sphere(3);
        c.volume();
        c.describe();
        r.area();
        r.perimeter();
        r.describe();
        s.volume();
        s.describe();
    }
}
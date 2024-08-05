package MyPackage2;
import MyPackage1.*;
public class Cone implements ThreeDShape
{
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
        System.out.println("--------------------------------------------------------");
        System.out.println("CONE");
        System.out.println("--------------------------------------------------------");
        System.out.printf("The Volume Of The Cone Is         : %.2fm³\n",vol);
        return 1;
    }
    public void describe()
    {
        System.out.println("DEFINITION : The Cone Is A Solid Or Hollow Object Which " +
                "\n             Tapers From A Circular Or Roughly Circular " +
                "\n             Base To A Point.");
    }
}
package MyPackage3;
import MyPackage1.*;
import MyPackage2.*;
public class rectangle implements TwoDShape {
    private double width, height;
    public rectangle (double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public double area()
    {
        double a = width * height;
        System.out.println("--------------------------------------------------------");
        System.out.println("RECTANGLE");
        System.out.println("--------------------------------------------------------");
        System.out.println("The Area Of The Rectangle Is      : "+a+"m³");
        return 1;
    }
    public double perimeter()
    {
        double p = 2 * (width + height);
        System.out.println("The Perimeter Of The Rectangle Is : "+p+"m³");
        return 1;
    }
    public void describe()
    {
        System.out.println("DEFINITION : The Rectangle Is A Plane Figure With Four " +
                "\n             Straight Sides & Four Right Angles," +
                "\n             Especially One With Unequal Adjacent Sides.");
    }
}
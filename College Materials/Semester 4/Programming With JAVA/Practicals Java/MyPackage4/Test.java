package MyPackage4;
import MyPackage1.*;
import MyPackage2.*;
import MyPackage3.*;
class Sphere implements ThreeDShape {
    private double radius;
    public Sphere (double radius)
    {
        this.radius = radius;
    }
    public double volume() {
        double vol = (4/3f) * 3.14 * radius * radius * radius;
        System.out.println("--------------------------------------------------------");
        System.out.println("SPHERE");
        System.out.println("--------------------------------------------------------");
        System.out.printf("The Volume Of The Sphere Is       : %.2fm³\n",vol);
        return 1;
    }
    public void describe()
    {
        System.out.println("DEFINITION : The Sphere Is A Round Solid Figure, Or " +
                "\n             Its Surface, With Every Point On Its " +
                "\n             Surface Equidistant From Its Centre.");
		System.out.println("--------------------------------------------------------");
		System.out.println("************************* END **************************");
		System.out.println("--------------------------------------------------------");
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
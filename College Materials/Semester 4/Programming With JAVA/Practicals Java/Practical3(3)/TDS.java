import java.util.Scanner;
class S
{
    public void print(String s)
    {
        System.out.println(s);
    }
    public void print(double s)
    {
        System.out.println(s);
    }
}
class employee
{
    S p = new S();
    double a,c,gs;
    String b;
    void in(String a, double b)
    {
        this.a = b;
        this.b = a;
    }
    void display()
    {
        p.print("Your name is:-");
        p.print(b);
        p.print("Your Salary is:-");
        p.print(a);
        p.print("Your DA is:-");
        c= a * 0.74;
        p.print(c);
        gs = a + c;
        p.print("Your Gross Salary Is : "+gs);
        if(gs<= 100000)
        {
            p.print("No tax applied!!");
            p.print("Your TDS is:-"  + gs);
        }
        else
        {
            double o = gs - 100000;
            double d = o * 0.1;
            p.print("Tax is:-" + d);
            p.print("Your TDS is:- "+ (gs+d));
        }
    }
}
class TDS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        S p = new S();
        p.print("Enter your name:-");
        String a = sc.next();
        p.print("Enter your salary:-");
        double b = sc.nextDouble();
        employee i = new employee();
        i.in(a,b);
        i.display();
    }
}
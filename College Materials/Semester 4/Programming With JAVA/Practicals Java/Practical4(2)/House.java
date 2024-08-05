import java.util.Scanner;//Practical-4(2)
class K
{
    public void print(String s)
    {
        System.out.println(s);
    }
}
interface Property
{
    void Compute_price();
}
class Bungalow implements Property
{
    K p = new K();
    Scanner s = new Scanner(System.in);
    String name;
    int length,width,Larea,Carea;
    Bungalow(String n,int l,int w)
    {
        name = n;
        length = l;
        width = w;
    }
    void display()
    {
        p.print("----------------------------------------------------");
        p.print("The Name Of The Bungalow Is : "+name);
        p.print("----------------------------------------------------");
    }
    void Landarea(){
        System.out.print("Enter The Area Of Land Is   : ");
        Larea = s.nextInt();
        p.print("The Area Of Land Is                  : "+Larea+"sq.feet");
    }
    void ConstructionArea(){
        Carea = length * width;
        p.print("The Construction Area Is             : " +Carea+"sq.feet");
    }
    public void Compute_price()
    {
        int Cc = 500 * Carea;
        p.print("The Construction Cost Of Bungalow Is : ₹"+Cc+"");
        int Ac = 200 * Larea;
        p.print("The Additional Cost Of Bungalow Is   : ₹"+Ac);
        int Lc = 400 * Larea;
        p.print("The Land Cost For Bungalow Is        : ₹"+Lc);
        int t = Cc + Ac + Lc;
        p.print("====================================================");
        p.print("The Total Price Is : ₹"+t);
        p.print("====================================================");
    }
}
class Flat implements Property
{
    K p = new K();
    String name;
    int length,width,Carea;
    Flat(String n, int l, int w)
    {
        name = n;
        length =l;
        width = w;
    }
    void display()
    {
        p.print("\n");
        p.print("----------------------------------------------------");
        p.print("The Name Of The Flat Is : "+name);
        p.print("----------------------------------------------------");
    }
    void ConstructionArea()
    {
        Carea =length * width;
        p.print("The Area Of Land Is                  : "+Carea+ "sq.feet");
    }
    public void Compute_price()
    {
        int Cc = 500 * Carea;
        p.print("The Construction Cost Of Flat Is     : ₹"+Cc);
        int Ac = 200000;
        p.print("The Additional Cost Of Flat Is       : ₹"+Ac);
        int t = Cc + Ac ;
        p.print("====================================================");
        p.print("The Total Price Is : ₹"+t);
        p.print("====================================================");
    }
}
class House
{
    public static void main(String[] args)
    {
        Bungalow b = new Bungalow("MANNAT", 50, 50);
        Flat f = new Flat("GALAXY", 30, 30);
        b.display();
        b.Landarea();
        b.ConstructionArea();
        b.Compute_price();
        f.display();
        f.ConstructionArea();
        f.Compute_price();
    }
}
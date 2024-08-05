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
class Cricket
{
	S p = new S();
	String name;
	int age;
	Cricket(String n ,int a)
	{
		name = n;
		age = a;
	}
	void display()
	{
		p.print("Player Name Is:"+name);
		p.print("Player Age Is:"+age);
	}
}
class Match extends Cricket
{
	int ODI,TEST;
	Match(String n ,int a,int o,int t)
	{
		super(n,a);
		ODI = o;
		TEST = t;
	}
	void display()
	{
		super.display();
		p.print("No Of ODI Is:"+ODI);
		p.print("No Of TEST Is:"+TEST);
	}
}
class Inheritance
{
	public static void main(String[] args)
    {
		Match m1 = new Match("Hunaid",21,10,5);
		Match m2 = new Match("Sachin",54,30,20);
		Match m3 = new Match("Virat",45,25,24);
		Match m4 = new Match("Dhoni",47,17,19);
		Match m5 = new Match("Pollard",48,16,17);
		m1.display();
		m2.display();
		m3.display();
		m4.display();
		m5.display();
    }
}

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
	void display()
	{
		for(int i=0;i<5;i++)
		{
			p.print("Player" +i+ "Name Is:"+n[i]);
		}
		for(int i=0;i<5;i++)
		{
			p.print("Player" +i+ "Age Is:"+a[i]);
		}
	}
}
class Match extends Cricket
{
	void display()
	{
		super.display();
		for(int i=0;i<5;i++)
		{
			p.print("Player" +i+ "Played No._Of_ODI Is:"+o[i]);
		}
		for(int i=0;i<5;i++)
		{
			p.print("Player" +i+ "Played No._Of_TEST Is:"+t[i]);
		}
	}
}
class Inheritance2
{
	public static void main(String[] args)
    {
	    S p = new S();
		Scanner sc = new Scanner(System.in);
		String n[] = new String [5];
		p.print("Enter The Five Names : ");
		for(int i=0;i<5;i++)
		{
			n[i]=sc.next();
		}
		int a[] = new int [5];
		p.print("Enter The Five Age : ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int o[] = new int [5];
		p.print("Enter The Five No_Of_ODI : ");
		for(int i=0;i<5;i++)
		{
			o[i]=sc.nextInt();
		}
		int t[] = new int [5];
		p.print("Enter The Five No_Of_TEST : ");
		for(int i=0;i<5;i++)
		{
			t[i]=sc.nextInt();
		}
		Match m = new Match();
		m.display();
    }
}

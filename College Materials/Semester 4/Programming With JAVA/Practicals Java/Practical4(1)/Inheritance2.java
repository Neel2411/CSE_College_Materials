//package com.company;
import java.util.Scanner;//Practical-4(1)
class O
{
    public void print(String s)
    {
        System.out.println(s);
    }
}
class Cricket3
{
    String w;
    int e;
    O p = new O();
    void setdata()
    {
        Scanner sc = new Scanner(System.in);
        p.print("Enter Name , Age , No_Of_ODI , No_Of_TEST : ");
        w = sc.nextLine();
        e = sc.nextInt();
    }
    void display(int a)
    {
        p.print("--------------------------------------------------------------------");
        p.print("******************************************");
        p.print("Player "+(a+1)+" Details Are  :- ");
        p.print("Player Name Is        : "+w);
        p.print("Player Age  Is        : "+e);
    }
}
class Match3 extends Cricket3
{
    int u,y;
    void setdata()
    {
        Scanner sc = new Scanner(System.in);
        super.setdata();
        u = sc.nextInt();
        y = sc.nextInt();

    }
    void display(int a)
    {
        super.display(a);
        p.print("No. Of ODI  Played Is : "+u);
        p.print("No. Of TEST Played Is : "+y);
        p.print("******************************************");
        p.print("--------------------------------------------------------------------");
    }
}
class Inheritance2
{
    public static void main(String[] args)
    {
        O p = new O();
        int q = Integer.parseInt(args[0]);
		p.print("You Have Choose "+q+" Players");
        Match3 m[] = new Match3[q];
        for(int i=0;i<q;i++)
        {
            m[i]=new Match3();
            m[i].setdata();
        }
        for(int i=0;i<q;i++)
        {
            m[i].display(i);
        }
    }
}
import java.util.Scanner;
class check
{
    void totalIP(int n)
    {
        System.out.println("Total number of ip address is 2^"+(32-n));
    }
    void first(int n,int a,int b,int c)
    {
        if(n==8)
        {
            System.out.println("First IP address is "+a+".0.0.0");
        }
        else if(n==16)
        {
            System.out.println("First IP address is "+a+"."+b+".0.0");
        }
        else
        {
            System.out.println("First IP address is "+a+"."+b+"."+c+".0");
        }
    }
    void last(int n,int a,int b,int c)
    {
        if(n==8)
        {
            System.out.println("Last IP address is "+a+".255.255.255");
        }
        else if(n==16)
        {
            System.out.println("Last IP address is "+a+"."+b+".255.255");
        }
        else
        {
            System.out.println("Last IP address is "+a+"."+b+"."+c+".255");
        }
    }
}
class demo
{
    public static void main(String[] args)
    {
        check cc = new check();
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,M,e;
        do
        {
            System.out.println("Enter IP address:-");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            System.out.println("Enter Mask from 8,16,24:-");
            M = sc.nextInt();
            if (a >= 0 && a <= 255 && b >= 0 && b <= 255 && c >= 0 && c <= 255 && d >= 0 && d <= 255 && M == 8 || M == 16 || M == 24)
            {
                if (a <= 127 && M == 8)
                {
                    System.out.println("Your IP address with mask is:-");
                    System.out.println(a + "." + b + "." + c + "." + d + "/" + M);
                    cc.totalIP(M);
                    cc.first(M, a, b, c);
                    cc.last(M, a, b, c);
                }
                else if (a <= 191 && M == 16)
                {
                    System.out.println("Your IP address with mask is:-");
                    System.out.println(a + "." + b + "." + c + "." + d + "/" + M);
                    cc.totalIP(M);
                    cc.first(M, a, b, c);
                    cc.last(M, a, b, c);
                }
                else if (a <= 223 && M == 24)
                {
                    System.out.println("Your IP address with mask is:-");
                    System.out.println(a + "." + b + "." + c + "." + d + "/" + M);
                    cc.totalIP(M);
                    cc.first(M, a, b, c);
                    cc.last(M, a, b, c);
                }
                else
                {
                    System.out.println("Invalid IP.");
                }
            }
            else
            {
                System.out.println("Invalid IP.");
            }
            System.out.println("Enter 1 to do operation again : ");
            e = sc.nextInt();
        }while(e==1);
    }
}
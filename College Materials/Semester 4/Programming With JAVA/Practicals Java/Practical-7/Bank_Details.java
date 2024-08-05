//Practical-7(1)
import java.util.Scanner;
class S
{
       public void print(String s)
       {
           System.out.println(s);
       }
}
class NotEnoughMoneyException extends Exception
{
    public NotEnoughMoneyException()
    {
        super();
    }
}
class Bank
{
    Scanner sc = new Scanner(System.in);
    S p = new S();
    int acc_no;
    double Balance,new_balance,updated_balance;
    String name;
    void insert(int a, String n,double i)
    {
        acc_no = a;
        name = n;
        Balance = i;
    }
    void display()
    {
        p.print("Account No. Is : " +acc_no);
        p.print("Customer Name Is : " +name);
        p.print("Initially Account Has ₹"+Balance+" Balance.");
    }
    public void Deposit(double z)
    {
        new_balance = Balance + z;
        p.print("Old Balance Is : ₹" + Balance);
        Balance=new_balance;
        p.print("After Depositing New Balance Is : ₹" + Balance);
    }
    public void withdraw()
    {
        if (Balance > 0) 
        {
            p.print("Enter How Much You Want To Withdraw : ");
            double g = sc.nextDouble();
            try
            {
                if (Balance < g)
                {
                    throw new ArithmeticException();
                }
                else
                {
                    updated_balance = Balance - g;
                    p.print("Old Balance Is : ₹"+ Balance);
                     Balance = updated_balance;
                    p.print("After Withdrawing New Balance Is : ₹"+ Balance);
                    if(updated_balance<500)
                    {
                         throw new NotEnoughMoneyException();
                    }
                }
            }
            catch (ArithmeticException e)
            {
                p.print("Balance Is Not Enough To Withdraw The Money... ");
            }
            catch (NotEnoughMoneyException e)
            {
                p.print("After Withdrawing Account Has Less Than ₹500 Balance...");
            }
        }
    }
}
public class Bank_Details 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        S p = new S();
        Bank b = new Bank();
        int e, t;
        do {
            p.print("Enter Your Account Number : ");
            int a = sc.nextInt();
            p.print("Enter Your Name : ");
            String n = sc.next();
            p.print("Initial Account Balance : ");
            double i = sc.nextInt();
            b.insert(a, n, i);
            b.display();
            l:
            do {
                p.print("Choice=>\n1.Deposit\n2.Withdraw\n3.Exit");
                p.print("Enter Your Which Operation You Want To Do : ");
                int w = sc.nextInt();
                switch (w) {
                    case 1:
                        p.print("Enter How Much You Want To Deposit : ");
                        double z = sc.nextDouble();
                        b.Deposit(z);
                        break;
                    case 2:
                        b.withdraw();
                        break;
                    case 3:
                        break l;
                    default:
                        p.print("Invalid Choice!!!");
                        e = 1;
                        continue;
                }
                p.print("Enter 1 To Do Operation Again:-");
                e = sc.nextInt();
            } while (e == 1);
            p.print("Enter 1 To Do Operation On New Account:-");
            t = sc.nextInt();
        } while (t == 1);
    }
}
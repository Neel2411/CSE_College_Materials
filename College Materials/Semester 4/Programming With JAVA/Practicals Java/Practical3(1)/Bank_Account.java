//package com.company;//Practical-3(1)
import java.util.Scanner;
class BankOperations
{
    Scanner sc = new Scanner(System.in);
    String D_name;
    int Acc_no;
    String Acc_type;
    double Balance=0,new_balance,updated_balance,g;
    public void insert(int a ,String n, double b,String t)
    {
        Acc_no=a;
        D_name=n;
        Balance=b;
        Acc_type=t;
    }
    public void display()
    {
        System.out.println("Account No. is :"+Acc_no+"\n"+"Depositor name is : "+D_name+"\n"+"Balance is : "+Balance+"\n"+"Account type is : "+Acc_type);
    }
    public void deposit(double dep)
    {
            new_balance = Balance + dep;
            Balance=new_balance;
            System.out.println("After depositing new_balance is : "+new_balance);
    }
    public void withdraw() {
        if (Balance > 0) {
            System.out.println("Enter how much you want to withdraw: ");
            g = sc.nextDouble();
            if (Balance < g) {
                System.out.println("Not enough balance...!!!");
            } else {
                updated_balance = Balance - g;
                Balance = updated_balance;
                System.out.println("After withdrawing updated_balance is : " + updated_balance);
            }
        }
        else
        {
            System.out.println("Your balance is zero....!!!\nPlease deposit some amount.");
        }
    }
}
class Bank_Account
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankOperations e1 = new BankOperations();
        int a, s, e = 0, t;
        double b, g;
        String c, d;
        do {
            System.out.println("Enter your account number : ");
            a = sc.nextInt();
            System.out.println("Enter your name : ");
            c = sc.next();
            System.out.println("Enter your account type : ");
            d = sc.next();
            System.out.println("Enter your account balance : ");
            b = sc.nextDouble();
            e1.insert(a, c, b, d);
            l:
            do {
                System.out.println("Choice=>\n 1.Deposit \n 2.Withdraw \n 3.Display balance");
                System.out.println("Enter your which operation you want to do : ");
                s = sc.nextInt();
                switch (s)
                {
                    case 1:
                        System.out.println("Enter how much you want to deposit : ");
                        g = sc.nextDouble();
                        e1.deposit(g);
                        break;
                    case 2:
                        e1.withdraw();
                        e=1;
                        continue l;
                    case 3:
                        e1.display();
                        break;
                    default:
                        System.out.println("Invalid choice!!!");
                        e=1;
                        continue l;
                }
                System.out.println("Enter 1 to do operation again:-");
                e = sc.nextInt();
            } while(e == 1);
            System.out.println("Enter 1 to do operation on new account:-");
            t = sc.nextInt();
        } while (t == 1);
    }
}

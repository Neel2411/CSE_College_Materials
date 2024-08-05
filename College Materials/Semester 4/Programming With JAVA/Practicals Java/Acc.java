import java.util.Scanner;
class BankAccount
{
	String D_name;
	int Acc_no;
	String Acc_type;
	double Balance,new_balance,updated_balance;
	public void insert(int a ,String n, double b,String t)
	{
		Acc_no=a;
		D_name=n;
		Balance=b;
		Acc_type=t;
	}
	public void display()
	{
		System.out.println("Account No. Is :"+Acc_no+"\n"+"Depositor Name Is : "+D_name+"\n"+"Balance Is : "+Balance+"\n"+"Account Type Is : "+Acc_type);
	}
	public void deposit(double dep)
	{
		new_balance = Balance + dep;
		System.out.println("After Depositing New_Balance Is : "+new_balance);
	}
	public void withdraw(double wd)
	{
		updated_balance = new_balance - wd;
		System.out.println("Ater Withdrawing Updated_Balance Is : "+updated_balance);
	}
	
}
class Acc
{
	public static void main(String args[])
	{
		BankAccount e1 = new BankAccount();
		e1.insert(101,"ABC",1000.0,"Saving");
		e1.deposit(100.0);
		e1.withdraw(10.0);
		e1.display();
	}
}
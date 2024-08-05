class Calculator
{
	int n1,n2,ans1,ans2;
	void init()
	{
		n1=10;
		n2=20;
	}	
    void add()
	{
    	ans1=n1+n2;
	}
	void sub()
	{
		ans2=n1-n2;
	}	
	void display()
	{
		System.out.println(ans1);
		System.out.println(ans2);
	}	
}	 
class calc
{
	public static void main(String args[])
	{
		init();
		add();
		sub();
		display();

	}
}	
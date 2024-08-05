class commandlinecal
{
	public static void main (String args[])
	{
		int a,b,d;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[2]);
		char c = args[1].charAt(0);
		switch(c)
		{
			case '+':
				d = a + b;
				System.out.println(d);
				break;
			case '-':
				d = a - b;
				System.out.println(d);	
				break;
			case '*':
				d = a * b;
				System.out.println(d);
				break;
			case '/':
				d = a / b;
				System.out.println(d);	
				break;
			default:
				System.out.println("Invalid Operator!!!");
				break;
		}
	}
}	
				
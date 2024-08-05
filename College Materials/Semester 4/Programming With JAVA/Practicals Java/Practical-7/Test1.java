//Practical-7(2)
import java.util.Scanner;
class J
{
    public void print(String s)
    {
        System.out.println(s);
    }
}
public class Test1
{
    public static void main(String[] args) {
        J p = new J();
        Scanner sc = new Scanner(System.in);
        double Average, Total = 0;
        
        p.print("Enter The Size Of The Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
		try 
		{	
            if (arr.length == 0) 
			{
                throw new ArithmeticException();
            }
            try 
			{
                p.print("Enter The Elements In The Array : ");
                int i;
                for (i = 0; i < arr.length; i++) 
				{
                    arr[i] = sc.nextInt();
					if (arr[i]<0)
					{
						throw new ArrayStoreException();
					}
                }
            }
            catch(ArrayStoreException e)
            {
                p.print("Array Has A Negative Or Non-Integer Value...");
            }
			for ( int i = 0; i < arr.length; i++) 
		{
			Total += arr[i];
		}
		Average = Total / n;
		System.out.format("The Average Is : %.3f", Average);
        }
        catch(ArithmeticException e)
        {
            p.print("Size Of Array Can't Be Zero...");
        }
		
    }
}
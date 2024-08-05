import java.util.Scanner;

public class Fibonacci
{
    public static void main (String args[])
    {
        int n1=0, n2=1, n3, i, f;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Value Of N : ");
        f = input.nextInt();

        System.out.print(n1 + " " + n2);

        for(i=0;i<f;i++)
        {
            n3 = n2 + n1;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
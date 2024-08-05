//package com.company;
//Practical 2-1
import java.util.Scanner;
//Printing function
class S
{
    public void print(String s)
    {
        System.out.println(s);
    }
    public void print(int s)
    {
        System.out.println(s);
    }
}
//Main
class Array_1D
{
    public static void main(String[] args)
    {
        //Object Creation
        S p= new S();
        Function f = new Function();
        Scanner sc = new Scanner(System.in);
        int d,a,s,e;
        do{
            //Scanning size of array
            p.print("Enter size of array :-");
            a=sc.nextInt();
            int arr[] = new int[a];
            //Scanning Array
            p.print("Enter array :-");
            for(int i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
            }
            //Asking choice
            s://label for do-while loop
            do{
                p.print("Operation you can do on array :-");
                p.print("Choices :- \n1.Maximum \n2.Minimum \n3.Reverse \n4.Average \n5.Sort in ascending order \n6.Sort in descending order \n7.Searching \n8.Display \n9.Size of array \n10.Exit");
                p.print("Enter which operation you want to do :-");
                s=sc.nextInt();
                //Switch case
                switch(s)
                {
                    case 1://MAX
                        f.MAX(arr,a);
                        break;
                    case 2://MIN
                        f.MIN(arr);
                        break;
                    case 3://REVERSE
                        f.REV(arr,a);
                        break;
                    case 4://AVERAGE
                        f.AVG(arr);
                        break;
                    case 5://SORT IN ASCENDING
                        f.SORAS(arr,a);
                        break;
                    case 6://SORT IN DESCENDING
                        f.SORDS(arr,a);
                        break;
                    case 7://SEARCHING
                        f.SER(arr);
                        break;
                    case 8://DISPLAY
                        p.print("Your array is :-");
                        for(int i=0;i<a;i++)
                        {
                            p.print(arr[i]);
                        }
                        break;
                    case 9://SIZE
                        p.print("The size of array is : ");
                        p.print(arr.length);
                        break;
                    case 10://EXIT
                        break s;//for closing do-while we labled it as "s" so we just break
                    default:
                        p.print("Enter valid choice!!!");
                        e=1;
                        continue s;
                }
                p.print("Enter 1 to do operation on this array again :-");
                e=sc.nextInt();
            }while(e==1);
            //Do-While loop
            p.print("Enter 1 to do operation on new array :-");
            d=sc.nextInt();
        }while(d==1);
        sc.close();
    }
}
//Operations
class Function
{
    S p= new S();
    Scanner sc = new Scanner(System.in);
    public void MAX(int c[], int b)
    {
        int max=c[0];
        for(int i=0;i<b;i++)
        {
            if(max<c[i])
            {
                max=c[i];
            }
        }
        p.print("Max. element in the array is : "+max);
    }
    public void MIN(int c[])
    {
        int min=c[0];
        for(int i=0;i<c.length;i++)
        {
            if(min>c[i])
            {
                min=c[i];
            }
        }
        p.print("Min. element in the array is : "+min);
    }
    public void REV(int c[],int b)
    {
        p.print("Reverse array is :");
        for (int i=b-1;i>=0;i--)
        {
            p.print(c[i]);
        }
    }
    public void AVG(int c[])
    {
        double Average ,sum=0.0;
        for(int i=0;i<c.length;i++)
        {
            sum = sum + c[i];
        }
        Average = sum / c.length;
        System.out.printf("Average of the array is : %.3f\n",Average);
    }
    public void SORAS(int c[],int b)
    {
        int temp;
        int a[]=new int[b];
        for(int i=0;i<c.length;i++)
        {
            a[i]=c[i];
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        p.print("Your array in ascending order is : ");
        for (int i=0;i<b;i++)
        {
            p.print(a[i]);
        }
    }
    public void SORDS(int c[],int b)
    {
        int temp;
        int a[]=new int[b];
        for(int i=0;i<c.length;i++)
        {
            a[i]=c[i];
        }
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        p.print("Your array in descending order is : ");
        for (int i=0;i<b;i++)
        {
            p.print(a[i]);
        }
    }
    public void SER(int c[])
    {
        int a,b=0;
        p.print("Enter the number which you want to search :- ");
        a=sc.nextInt();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==a)
            {
                System.out.print("The number is at place ARRAY["+ i + "]\n");
                b=1;
            }
        }
        if(b==0)
        {
            System.out.print("Number not found!!!\n");
        }
    }
}
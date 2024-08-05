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
            System.out.println("Enter size of array:-");
            a=sc.nextInt();
            int arr[] = new int[a];
            //Scanning Array
            System.out.println("Enter array:-");
            for(int i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
            }
            //Asking choice
            s://lable for do-while loop
            do{
                p.print("Operation you can do on array:-");
                p.print("Choices:- \n1.Maximum \n2.Minimum \n3.Reverse \n4.Average \n5.Sort In Ascending Order \n6.Sort In Descending Order \n7.Searching \n8.Display \n9.Size Of Array \n10.Exit");
                p.print("Enter which operation you want to do:-");
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
                    case 4://AVARAGE
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
                        p.print("Your array is:-");
                        for(int i=0;i<a;i++)
                        {
                            System.out.println(arr[i]);
                        }
                        break;
                    case 9://SIZE
                        p.print(arr.length);
                    case 10://**
                        break s;//for closing do-while we labled it as "s" so we just break
                    default:
                        p.print("Enter valid choice.");
                        e=1;
                        continue s;
                }
                System.out.println("Enter 1 to do operation on this array again:-");
                e=sc.nextInt();
            }while(e==1);//**
            //Do-While loop
            System.out.println("Enter 1 to do operation on new array:-");
            d=sc.nextInt();
        }while(d==1);
        sc.close();
    }
}
//Operations
class Function
{

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
        System.out.println("Max is:"+max);
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
        System.out.println("Min is:"+min);
    }
    public void REV(int c[],int b)
    {
        System.out.println("Reverse array is :");
        for (int i=b-1;i>=0;i--)
        {
            System.out.println(c[i]);
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
        System.out.printf("\nAverage Of The Array Is : %.3f\n",Average);
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
        System.out.println("Your array in Ascending order is:-\n");
        for (int i=0;i<b;i++)
        {
            System.out.println(a[i]);
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
        System.out.println("Your array in Descending order is:-\n");
        for (int i=0;i<b;i++)
        {
            System.out.println(a[i]);
        }
    }
    public void SER(int c[])
    {
        int a,b=0;
        System.out.println("Enter the number which you want to search:-");
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
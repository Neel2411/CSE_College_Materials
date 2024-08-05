package com.company;

import java.util.Scanner;
//Printing function
class S
{
    public void print(String s)
    {
        System.out.println(s);
    }
}
//Main
class LAB2
{
    public static void main(String []args)
    {
        //Object Creation
        S p= new S();
        Function f = new Function();
        Scanner sc = new Scanner(System.in);
        int d,a,s;
        do{
            //Scanning size of array
            p.print("Enter size of array:-");
            a=sc.nextInt();
            int []arr = new int[a];
            //Scanning Array
            p.print("Enter array:-");
            for(int i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
            }
            //Asking choice
            p.print("Enter which operation you want to do:-");
            p.print("Choices: \n1.Max \n2.Min \n3.Reverse \n4.Average \n5.Display \n6.Exit");
            s=sc.nextInt();
            //Switch case
            switch(s)
            {
                case 1:
                    f.MAX(arr,a);
                    break;
                case 2:
                    f.MIN(arr,a);
                    break;
                case 3:
                    f.REV(arr,a);
                    break;
                case 4:
                    f.AVG(arr);
                    break;
                case 5:
                    f.DIS(arr);
                case 6:
                    break;
            }
            //Do-While loop
            p.print("Enter 1 to do operation again:-");
            d=sc.nextInt();
        }while(d==1);
        sc.close();
    }
}
//Operations
class Function
{
    private int[] a;

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
    public void MIN(int c[], int b)
    {
        int min=c[0];
        for(int i=0;i<b;i++)
        {
            if(min>c[i])
            {
                min=c[i];
            }
        }
        System.out.println("Max is:"+min);
    }
   public void REV(int array[],int size)
    {
        for (int i=size-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }
    public void AVG(int array[])
    {
        double Average ,sum=0.0;
        for(int i=0;i<array.length;i++)
        {
            sum = sum + array[i];
        }
        Average = sum / array.length;
        System.out.println("Average Of The Array Is:"+Average);
    }
    public void DIS(int array[])
    {
        //Printing Array
        System.out.println("Your array:-");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}

//package com.company;

import java.util.Scanner;
class P
{
    public void print(String s)
    {
        System.out.println(s);
    }
    public void print(int s)
    {
        System.out.print(s);
    }
    public void print(float s)
    {
        System.out.print(s);
    }
}
class Array_2D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        P p=new P();
        matrix ma1=new matrix();
        matrix ma2=new matrix();
        int r,c,i,j,op;
        p.print("Enter row size:-");
        r=sc.nextInt();
        p.print("Enter column size:-");
        c=sc.nextInt();
        ma1.in(r,c);
        ma2.in(r,c);
        p.print("Operation you can do on matrix:-");
        p.print("1.Transpose\n2.Maximum among matrix\n3.Average of matrix\n4.Multiplication of two matrix\n5.Display\n6.Exit");
        op=sc.nextInt();
        switch(op)
        {
            case 1:
                ma.tra();
            case 2:
            ma.Add();
        }
    }
}
class matrix
{
    int row,column,i,j;
    float m[][];
    //to get values
    public void in(int r,int c)
    {
        m = new float[r][c];
        row=r;
        column=c;
         p.print("Enter elements of Matrix:-");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                p.print("Enter element at position, row"+(i+1)+",and column"+(j+1)+" :-");
                m[i][j]=sc.nextInt();
            }
        }
        p.print("Your Matrix is:-");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(m[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public void n()
    {
        float n[][]=m[][];
    }
    //transpose
    public void tra()
    {
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.print(m[j][i]+"  ");
            }
            System.out.println();
        }
    }
    public void Add(matrix ma1,matrix ma2)
    {
        float res[][]=new float[row][column];
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                res[][]=ma1.in+
            }
            System.out.println();
        }
    }
}

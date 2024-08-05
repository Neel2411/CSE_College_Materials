//package com.company;
//Practical 2-2
import java.util.Scanner;
class P
{
    public void print(String s)
    {
        System.out.print(s);
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
public class Array_2D
{
    public static void main(String[] args)
    {
        matrix ma1=new matrix();
        Scanner sc = new Scanner(System.in);
        P p = new P();
        int op,r,r1,c,e,d;
        do{
            p.print("Enter size of row:-\n");
            r=sc.nextInt();
            p.print("Enter size of column:-\n");
            c=sc.nextInt();
            ma1.in(r,c);
            l:
            do{
                p.print("\nOperation you can do on matrix:-\n");
                p.print("1.Transpose\n2.Addition of two matrix\n3.Maximum among matrix\n4.Average of matrix\n5.Multiplication of two matrix\n6.Display\n7.Exit\n");
                p.print("Enter which operation you want to perform:-\n");
                op=sc.nextInt();
                switch(op)
                {
                    case 1:
                        ma1.tra();
                        break;
                    case 2:
                        matrix ma2=new matrix();
                        ma2.in(r,c);
                        ma2.Add(ma1,ma2);
                        break;
                    case 3:
                        ma1.max();
                        break;
                    case 4:
                        ma1.avg();
                        break;
                    case 5:
                        matrix ma3=new matrix();
                        p.print("Row size is: "+c+" and enter column size:-\n");
                        r1=sc.nextInt();
                        ma3.in(c,r1);
                        ma3.Mul(ma1,ma3);
                        break;
                    case 6:
                        ma1.dis();
                        break;
                    case 7:
                        break l;
                    default:
                        p.print("Enter valid choice!!!");
                        e=1;
                        continue l;
                }
                p.print("\nEnter 1 to do operation again on this matrix:-\n");
                e=sc.nextInt();
            }while(e==1);
            p.print("Enter 1 to do operation on new matrix:-\n");
            d=sc.nextInt();
        }while(d==1);
        sc.close();
    }
}
class matrix
{
    int i, j;
    int row, column;
    float m[][];
    P p = new P();
    Scanner sc = new Scanner(System.in);
    public void in(int r, int c)
    {
        row = r;
        column = c;
        m = new float[row][column];
        p.print("Enter your  " + row + " x " + column + "  matrix:-\n");
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                m[i][j] = sc.nextFloat();
            }
        }
        p.print("Your matrix is:-\n");
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                p.print(m[i][j] + "   ");
            }
            p.print("\n");
        }
    }
    public void tra()
    {
        p.print("Your transpose array:-\n");
        for (i = 0; i < column; i++)
        {
            for (j = 0; j < row; j++)
            {
                p.print(m[j][i] + "   ");
            }
            p.print("\n");
        }
    }
    public void Add(matrix m1, matrix m2)
    {
        float res[][] = new float[row][column];
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                res[i][j] = m1.m[i][j] + m2.m[i][j];
            }
        }
        p.print("Your resulted matrix is:-\n");
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                p.print(res[i][j] + "   ");
            }
            p.print("\n");
        }
    }
    public void max()
    {
        float Max = m[0][0];
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                if (m[i][j] > Max)
                {
                    Max = m[i][j];
                }
            }
        }
        p.print("\nMaximum among matrix is:-\n" + Max);
    }
    public void avg()
    {
        float Avg, sum = 0;
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                sum = sum + m[i][j];
            }
        }
        Avg = sum / (row * column);
        p.print("\nAverage among matrix is:-\n" + Avg);
    }
    public void Mul(matrix m1, matrix m3)
    {
        float r[][] = new float[m1.row][m3.column];
        if (m1.column == m3.row)
        {
            for (i = 0; i < m1.row; i++)
            {
                for (j = 0; j < m3.column; j++)
                {
                    for (int k = 0; k < m3.row; k++)
                    {
                        r[i][j] += m1.m[i][k] * m3.m[k][j];
                    }
                }
            }
        }
        p.print("\nYour resulted matrix is:-\n");
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                p.print(r[i][j] + "   ");
            }
            p.print("\n");
        }
    }
    public void dis()
    {
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                p.print(m[i][j] + "   ");
            }
            p.print("\n");
        }
    }
}
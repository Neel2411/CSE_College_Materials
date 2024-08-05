import java.util.Scanner;
class S
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
class prac22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		S p=new S();
		matrix ma=new matrix();
	int r,c,i,j,op;
		p.print("Enter row size:-");
		r=sc.nextInt();
		p.print("Enter column size:-");
		c=sc.nextInt();
	float m[][]=new float[r][c];
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
				p.print(m[i][j]);
			}
			p.print("\n");
		}
		p.print("Operation you can do on matrix:-");
		p.print("1.Transpose\n2.Maximum among matrix\n3.Avarage of matrix\n4.Multiplication of two matrix\n5.Display\n6.Exit\n");
		op=sc.nextInt();
		ma.in(m,r,c);
	switch(op)
	{
		case 1:
		ma.tra();
	}
	}
}
class matrix
{
	int row,column;
	float m[][];
//to get values
	public void in(float mat[][],int r,int c)
	{
		row=r;column=c;
		//loop for saving real matrix to local variable
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				m[i][j]=mat[i][j];
			}
		}
	}
//transpose
	public void tra()
	{
		float temp;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if((i+1)!=(j+1))
				{
					temp=m[i][j];
					m[i][j]=m[j][i];
					m[j][i]=temp;
				}
			}
		}
//printing
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				p.print(m[i][j]);
			}
			p.print("\n");
		}
	}
}

#include<stdio.h>
#include<conio.h>

int main()
{
	int a[10],i,j,temp;
	printf("Enter your array of 10 elements:-\n");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
	}
		printf("Your array is:-\n");
	for(i=0;i<10;i++)
	{
		printf("%d\n",a[i]);
	}
		
	for(i=0;i<10;i++)
	{
		for(j=i+1;j<10;j++)
		{
			if(a[j]<a[i])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	printf("Your array in sorting order is:-\n");
	for(i=0;i<10;i++)
	{
		printf("%d\n",a[i]);
	}
	return 0;
}

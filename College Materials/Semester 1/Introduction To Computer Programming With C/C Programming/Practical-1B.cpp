#include<stdio.h>
#include<conio.h>
int main()
{
	int a[50],S,i,b[50],j=0;
	//inserting
	printf("\nHow many numbers you want to enter:-\n");
	scanf("%d",&S);
	printf("Enter the value of array:\n");
	
	for(i=0;i<S;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Your array is:\n");
	for(i=0;i<S;i++)
	{
	   printf("%d\n",a[i]);	
	}
	//logic
	for(i=0;i<S;i++)
	{
		for(j=i+1;j<=S;j++)
		{
			if(a[j]==a[i])
			a[j]='\0';
		}
	}
	
	//printing
	printf("Your array after deleting duplicate items is:-\n");
	for(i=0;i<S;i++)
	{
	   printf("%d\n",a[i]);	
	}
	
    return 0;
}

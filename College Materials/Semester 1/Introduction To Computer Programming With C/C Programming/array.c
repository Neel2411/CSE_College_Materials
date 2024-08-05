#include<stdio.h>
int main()
{
	int i,value[5];
	printf("enter the value of array:");
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&value[i]);
	}
	printf("display array:");
	
	for(i=0;i<5;i++)
	{
	   printf("%d\n",value[i]);	
	}
	return 0;
	
	
}

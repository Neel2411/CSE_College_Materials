#include<stdio.h>
int main()
{
	int a[50],size ;
	printf("enter the size of Array:");
	scanf("%d",&size);
	printf("input the numbers");

		for(int i=0;i<size;i++)
	{
	scanf("%d,&a[i]");
	}
	printf("your array is:");
	for(int i=0;i<size;i++)
	{
		printf("%d",a[i]);
	}
	printf("reverse order of array is:");
	for(int i=size;i>0;i--)
	{
		printf("%d",a[i-1]);
			}
}

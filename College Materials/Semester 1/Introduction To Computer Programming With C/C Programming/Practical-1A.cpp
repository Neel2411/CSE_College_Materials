#include<stdio.h>
#include<conio.h>

int main()
{
	int a[50],b,c,temp,i,d;
do 
{
	printf("Operation you can do on array:-\n1.Insert\n2.Delete\nEnter which you want to do:-\n");
	scanf("%d",&b);
switch(b)
{
	do {
	case 1:
		printf("\nHow many numbers you want to enter:-\n");
	    scanf("%d",&temp);
	printf("Enter the value of array:\n");
	
	for(i=0;i<temp;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Your array is:\n");
	
	for(i=0;i<temp;i++)
	{
	   printf("%d\n",a[i]);	
	}
	printf("\nPress 1 to enter again or Press 0 to exit:-\n");
	scanf("%d",&c);
	}while(c==1);
    break;
	case 2:
	do {
	printf("Enter at which position you want to delete:-\n");
	scanf("%d",&d);
	if(d>temp)
	printf("Delation not possible.");
	else
	{
		a[d-1]='\0';
	printf("Your array is:-\n");
	for(i=0;i<temp;i++)
	{
	   printf("%d\n",a[i]);	
	}
    } 
	printf("\nPress 1 to delete again or Press 0 to exit:-\n");
	scanf("%d",&c);
     }while(c==1);
	 break;						
}
printf("\nPress 1 to do operation again or Press 0 to exit:-\n");
scanf("%d",&c);
}while(c==1);
return 0;
}

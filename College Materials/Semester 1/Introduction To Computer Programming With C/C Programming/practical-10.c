#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10],c,n,i,j,k,min,temp,t2;
    printf("Enter how many numbers you want to add in array:-\n");
    scanf("%d",&n);
    printf("Enter array:-\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    lable:
    printf("Enter how you want to sort array:-\n1.Bubble sorting\n2.Selection sorting:-\n");
    scanf("%d",&c);
    switch (c)
    {
    case 1:
    printf("you selected bubble sorting:-\n");
            for(i=0;i<n-1;i++)
            {
                for(j=0;j<n-i-1;j++)
                 {
                    if(a[j]>a[j+1])
                    {
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        t2=1;
                    }
                    else
                    t2=0;
                 }
                 if(t2==1)
                 {
                    for(k=0;k<=i;k++)
                    printf("Your %d swap is of a[%d] and a[%d]\n",i+1,a[k],a[k+1]);
                 }
            }
            printf("Your sorted array is:-\n");
            for(i=0;i<n;i++)
            printf("%d\n",a[i]);
           
        break;
    case 2:
printf("you selected selection sorting:-\n");
            for(i=0;i<n-1;i++)
            {
                 min=i;
                for(j=i+1;j<n;j++)
                 {
                    if(a[j]<a[min])
                    {
                        min=j;
                    }
                 }
                  temp=a[i];
                    a[i]=a[min];
                    a[min]=temp;
                for(k=0;k<=i;k++)
                 printf("Your %d swap is of a[%d] and a[%d]\n",i+1,a[k]-1,a[k+1]-1);
            }
            printf("Your sorted array is:-\n");
            for(i=0;i<n;i++)
            printf("%d\n",a[i]);
           
        break;    
    default:
     printf("Invalid input.");
        goto lable;
    }
}
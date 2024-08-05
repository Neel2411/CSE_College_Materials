//Practical-6
#include<stdio.h>
#include<conio.h>
#define MAX 5
int main()
{
    int queue[MAX],rear=-1,front=-1,c,a,i;
lable:
    printf("Operation you can do on queue:-\n1.Insertion\n2.Deletion\n3.Display\n4.Exit\n Enter which you want to perform:-\n");
    scanf("%d",&c);
    switch (c)
    {
    case 1:
        printf("Enter the value:-\n");
        scanf("%d",&a);
        if(front==0 && rear==MAX-1)//cheking for full queue
        {
            printf("Queue is overflow.\n");
        }
        else if(rear==front-1)//if front!=0 then checking for full queue
        {
            printf("Queue is overflow.\n");
        }
        else if(front==-1 && rear==-1)//if queue is empty
        {
            front=rear=0;
            queue[rear]=a;
            printf("%d is added in queue.\n",a);
        }
        else if(front!=0 && rear==MAX-1)//if front!=0 then input
        {
           rear=0;
           queue[rear]=a;
           printf("%d is added in queue.\n",a);
        }
        else// if other condition are wrong then insertion
        {
          rear=rear+1;
          queue[rear]=a;
          printf("%d is added in queue.\n",a);
        }
        goto lable;
    case 2:
         if(front==rear)
         {
             if(rear==0)
             {
                  a=queue[front];
                  queue[front]=0;
                  front=rear=-1;
                printf("%d is deleted from queue.\n",a);
             }
             else if(rear==front && rear!=-1)
             {
                  a=queue[front];
                  queue[front]=0;
                  front=rear=-1;
                printf("%d is deleted from queue.\n",a);
             }
             else
             printf("Queue is underflow.\n");
         }
        else if(front==MAX-1)
         {
            a=queue[front];
            queue[front]=0;
             front=0;
            printf("%d is deleted from queue.\n",a);
        }
         else
         {
            a=queue[front];
            queue[front]=0;
            front++;
            printf("%d is deleted from queue.\n",a);
         }
         goto lable;
    case 3:
           if(front==-1 && rear==-1)
         {
             printf("Queue is underflow.\n");
         }
         else 
         {
             printf("Queue is:-\n");
             if(front<=rear)
             {
                for(int i=front;i<=rear;i++)
                {
                    printf("queue[%d]=%d\n",i,queue[i]);
                }
             }
             else
             {
                 for(int i=front;i<MAX;i++)
                {
                    printf("queue[%d]=%d\n",i,queue[i]);
                }
                for(i=0;i<=rear;i++)
                 {
                    printf("queue[%d]=%d\n",i,queue[i]);
                }
             }
         } 
         goto lable;
    default:
      break;  
    }
        return 0;
}
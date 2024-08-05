#include<stdio.h>
#include<conio.h>
#define MAX 5
int main()
 {
    int	queue[MAX],rear=-1,front=-1,c,a;
 lable:
        printf("Operations you can do on stack:-\n1. Insert \n2. Delete \n3. Display \n4. Exit \nEnter which you want to perform:-\n ");
        scanf("%d",&c);

        
switch (c) 

{
case 1://done
   	         printf("Enter the value:-\n");
             scanf("%d",&a);
             if(rear==MAX-1)
             {
             	printf("Queue is overflow.\n");
	        }
	         else
	       {
	    	 if(front==-1 && rear==-1)
                {
    	          front=0;
    	          rear=0;
    	          queue[rear]=a;
		         	printf(" %d is added in stack.\n",a);
      	        }
	            else
	            {
	            rear=rear+1;
		        queue[rear]=a;
		         	printf(" %d is added in stack.\n",a);
	            }
	        }
	        
            goto lable;
case 2: 
         	 
	            if(front==-1 || front>rear)
                {
    	          printf("Queue is underflow.\n");
      	        }
	            else
	            {
	            	a=queue[front];
	            	front=front+1;
	            		printf(" %d is deleted from stack.\n",a);
		        }
    
           goto lable;
		    

case 3://done
	    if(front==-1 || front>rear)
	   { 
	       printf("Queue is empty\n");
	    }	
		else
		{
		 printf("Queue is:-\n");
		 
		 for(int i=front;i<=rear;i++)
		    {
		   	  printf("queue[%d]=%d\n",i,queue[i]);
			}
			
		}
		goto lable;
		
case 4://done
	break;
}

    return 0;
 }

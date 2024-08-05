#include<stdio.h>
#include<conio.h>
int main()
 {
    int	stack[15],top=NULL,a,b,c,p;
 do{
        printf("Operations you can do on stack:-\n1. Push \n2. Pop \n3. Peep \n4. Display \nEnter which you want to perform:-\n ");
        scanf("%d",&c);

        
switch (c) 

{
case 1:
         do{
   	         printf("Enter the value you want to enter in stack:-\n");
             scanf("%d",&a);
	            if(top==14)
                {
    	          printf("Stack is overflow.");
      	        }
	            else
	            {
	            
		         top=top+1;
		         stack[top]=a;
		         	printf(" %d is added in stack.",a);
	            }
	         printf("\nPress 1 to enter again or Press 0 to exit:-\n");
	        scanf("%d",&b);
            }while(b==1);
break;
case 2: 
         do{
         	 
	            if(top==-1)
                {
    	          printf("Stack is underflow.");
      	        }
	            else
	            {
	            	printf("Element %d is deleted.",a);
		         top=top-1;
		        }
        
		    printf("\nPress 1 to pop again or Press 0 to exit:-\n");
	        scanf("%d",&b);
           }while(b==1);
break; 
case 3: 
         do{
         	 printf("Enter the position you want to see:-\n");
         	 scanf("%d",&p);
         	 if((top-p)<=-1)
         	 {
         	 	printf("Stack is overflow");
			  }
			  else
			  {
			  	printf("The number at position %d is %d",p,stack[top-p]);
				}
	            
		    printf("\nPress 1 to Peep again or Press 0 to exit:-\n");
	        scanf("%d",&b);
           }while(b==1);
           break;
case 4:
	    if(top==NULL)
	   { 
	       printf("Stack is empty");
	    }	
		else
		{
		 printf("Stack is:-\n");
		 
		 for(int i=top;i>0;i--)
		    {
		   	  printf("stack[%d]=%d\n",i-1,stack[i]);
			}
			
		}
		break;	

}//switch close
printf("\nPress 1 to do operation again or Press 0 to exit:-\n");
scanf("%d",&b);
}while(b==1);
    return 0;
 }

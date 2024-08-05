#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>
#define MAX 50
char s[MAX];
int top='\0';
void push(char i)
{
	if(top>MAX)
	{
		printf("Stack is overflow.");
	}
	else
	{
	top=top+1;
	s[top]=i;
    }
}
char pop()
{
	char i;
	if(top<0)
	{
		 printf("Stack is underflow.");
		 getchar();
		 exit(1);
	}
	else
	{
		i=s[top];
		top=top-1;
		return(i);
	}
}
int op(char sym)
{
	if(sym=='^'||sym=='*'||sym=='/'||sym=='+'||sym=='-')
	return 1;
	else
	return 0;
}
int pre(char sym)
{
	if(sym=='^')
	return 3;
	else if(sym=='*'||sym=='/')
	return 2;
	else if(sym=='+'||sym=='-')
	return 1;
	else
	return 0;
}
void post(char ex[], char p[])
{
	int i=0,j=0;
	char item,x;
	push('(');
	strcat(ex,")");
	item=ex[i];
	while(item!='\0')
	{
		if(item=='(')
		{
			push(item);
		}
		else if(isdigit(item) || isalpha(item))
		{
			p[j]=item;
			j++;
		}
		else if(op(item)==1)
		{
			x=pop();
			while(op(x)==1 && pre(x)>=pre(item))
			{
				p[j]=x;
				j++;
				x=pop();	
			}
			push(x);
			push(item);
		}
		else if(item==')')
		{
			x=pop();
			while(x!='(')
			{
				p[j]=x;
				j++;
				x=pop();
			}
		}
		else
		{
			printf("\nInvalid infix expression.\n");
			getchar();
			exit(1);
		}
		i++;
		item=ex[i];
	}
	if(top>0)
	{
		printf("\nInvalid infix expression.\n");
		getchar();
		exit(1);
	}
	p[j]='\0';
}
int main()
{
	char ex[MAX],p[MAX];
	printf("Enter your expression:-\n");
	gets(ex);
	post(ex,p);
	puts(p);
	return 0;
}

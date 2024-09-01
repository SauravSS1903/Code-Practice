#include<stdio.h>
#include<ctype.h>
#include<string.h>
char stack[100];
int top=-1;
int temp[100];
char p[100];
int t=-1;
void push(char x)
{
    stack[++top]=x;
}
char pop()
{
    if(top==-1)
        return -1;
    else
        return stack[top--];
}
int priority(char x)
{
    if(x=='(')
        return 0;
    else if(x=='+'||x=='-')
        return 1;
    else if(x=='*'||x=='/')
         return 2;
    else if (x=='^')
        return 3;
return 0;
}
void sum()
{
 int x,y,op;
 char str[20];
 for(int i=0;i<strlen(p);i++)
 {
    if(isdigit(p[i])) 
    {
        str[0]=p[i];
        str[1]="\0";
        temp[++t]=atoi(str);
    }
    else 
    { 
        
        x=temp[t--];
        y=temp[t--];
        switch(p[i]) 
        {
            case '+' : 
               op=y+x; 
                break;
            case '-' :
                op=y-x; 
                break;
            case '*' : 
                op=y*x;
                break;
            case '/' :
               op=y/x;
                break;
        }
        temp[++t]=op;
    }
 }
 printf("%d\n",temp[0]);

}

int main()
{
    int l=0,m=0;
    char exp[100];
    char w[30];
    char *e,x;
    printf("Enter the expression");
    scanf("%s",&exp);
    //e=exp;
    int r=strlen(exp);
    for(int i=r;i>=0;i--)
        w[m++]=exp[i];
    e=w;
    while(*e!='\0')
    {
        if(isalnum(*e))
            p[l++]=*e;
        else if(*e=='(')
            push(*e);
        else if(*e==')')
            while((x=pop())!='(')
                p[l++]=x;
        else 
        {
            while(priority(stack[top])>=priority(*e))
                p[l++]=stack[top--];
            push(*e);
        }
    e++;
    }
    while(top!=-1)
    {
       p[l++]=pop();
    }
    p[l]="\0";
   // printf("%s\n",p);
    //sum();
    int q=strlen(p);
    for(int i=q;i>=0;i--)
        printf("%c",p[i]);
    return 0;
}




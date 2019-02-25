#include <stdio.h>


int f(int n,int a)

   {
    if(n>1)
        {return f(n-1) + f(n-2);}
    else if (n==1)
        {return a;}
    else if (n==0)
        {return 0;}
   }

   int main()
{
int n=5;int a=5;
printf("n= %d",n);
}


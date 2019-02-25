#include<stdio.h>
main()
{
    float l,b,p;
    printf("\nEnter length: ");
    scanf("%f",&l);
    printf("\nEnter breadth: ");
    scanf("%f",&b);
    p=2*(l+b);
    printf("Perimeter of Rectangle=%.2f",p);
}

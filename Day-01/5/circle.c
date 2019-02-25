#include<stdio.h>
main()
{
    float r,a,d,c,pi=3.1416;
    printf("Enter value of radius: ");
    scanf("%f",&r);
    a=pi*r*r;
    c=2*pi*r;
    d=2*r;
    printf("\nArea of circle=%.2f",a);
    printf("\nCircumference of circle=%.2f",c);
    printf("\nDiameter of circle=%.2f",d);
}

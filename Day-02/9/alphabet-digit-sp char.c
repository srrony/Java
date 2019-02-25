#include<stdio.h>
main()
{
    char c1;

    printf("Enter a character: ");
    scanf("%c",&c1);
    if(c1=='a' || c1=='A' || c1=='b' || c1=='B' || c1=='c' || c1=='C' || c1=='d' || c1=='D' || c1=='e' || c1=='E' || c1=='F' || c1=='f' || c1=='g' || c1=='G' || c1=='h' || c1=='H' || c1=='i' || c1=='I' || c1=='j' || c1=='J' || c1=='k' || c1=='K' || c1=='l' || c1=='L' || c1=='m' || c1=='M' || c1=='n' || c1=='N' || c1=='o' || c1=='O' || c1=='p' || c1=='P' || c1=='q' || c1=='Q' || c1=='r' || c1=='R' || c1=='s' || c1=='S' || c1=='t' || c1=='T' || c1=='u' || c1=='U' || c1=='v' || c1=='V' || c1=='w' || c1=='W' || c1=='x' || c1=='X' || c1=='y' || c1=='Y' || c1=='z' || c1=='Z')
    {
        printf("\nThis is an Alphabet.\n\n");

    }
    else if(c1=='0' || c1=='1' || c1=='2' || c1=='3' || c1=='4' || c1=='5' || c1=='6' || c1=='7' || c1=='8' || c1=='9')

    {printf("\nThis is a Digit.\n\n");}

    else{printf("\nThis is Special character.\n\n");}
}

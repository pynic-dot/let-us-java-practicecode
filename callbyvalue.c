#include<stdio.h>
void swapv(int*, int*);
int main()
{
    int a = 10, b =20;
    printf("\nBefore value of a = %d and value of b = %d\n",a,b);
    // printf("\n address of a = %u and address of b = %u",&a, &b);
    swapv(&a,&b);
    return 0;
}
void swapv(int *x, int *y)
{
    int z;
    z = *x;
    *x=*y;
    *y=z;
    printf("\nvalue of a = %d and value of b = %d\n",*x,*y);
}
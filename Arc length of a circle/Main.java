#include<stdio.h>
int main() 
{
  float r, an, l;
  scanf("%f%f", &r, &an) ;
  l=2*3.14*r*(an/360) ;
  printf("%0.2f", l) ;
  return 0;
}
  
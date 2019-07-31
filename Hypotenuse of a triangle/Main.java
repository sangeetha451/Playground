#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  

     float e,  H, g;
  scanf("%f%f", &e, &H) ;

     g = hypotf(e, H);
     printf("%0.2f", g);
     return 0;

  return 0;
}
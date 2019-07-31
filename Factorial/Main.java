#include<stdio.h>
int main()
{
	//your code here
   long int fact=1, i, n;
    scanf("%ld", &n) ;
  for(i=1;i<=n;i++) 
  
    fact*=i;
  
  printf("%ld", fact) ;
}
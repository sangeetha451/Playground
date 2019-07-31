#include<stdio.h>
int main()
{
  //type your code here
  char z;
  scanf("%s", &z) ;
  if(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' || z == 'A' || z == 'E' || z == 'I' || z == 'O' || z == 'U') 
    printf("Vowel") ;
  else
    printf("Consonant") ;
    
  return 0;
}
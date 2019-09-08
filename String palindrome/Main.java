#include <stdio.h>
int main()
{
  char a[100];
  gets(a);
   int b,f=0,j;
 b= strlen(a);
  for(int i=0;i<b/2;i++)
  {
          j=b-1;
              if(a[i]!=a[j])
             {
                f=1;
              }
    b--;
  }
      if(f==0)
        printf("%s is a palindrome",a); 
  else
    printf("%s is not a palindrome",a); 
   return 0;
}
#include <stdio.h>
int main() 
{
	 
int a,c,g,s=0,f=0,h,n;

  scanf("%d",&a);

g=a;
  n=a;
  while(a>0)
  {
     a=a/10;
    c=++f;
  }
  
 
  while(g>0)
  {
   h=g%10;
  g=g/10;
  s=s+pow(h,c);
    
  }
  
  
  if(n==s)
  printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;

}
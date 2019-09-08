#include <stdio.h>
int fact(int z) 
{
	int a,c,g,s=1,f=0,h,n;

 


  n=z;
for(c=1;c<=z;c++)
  {
   s=s*c;
  }
     
	return s;
}
int main()
{
  int x,y,m=0,l,j;
  scanf("%d",&x);
  j=x;
  while(x!=0)
  {
    y=x%10;
    x=x/10;
    l= fact(y);  
    m=m+l;
  
  }

 if(m==j)
 {
   printf("Yes");
 }
  else
     printf("No");
}
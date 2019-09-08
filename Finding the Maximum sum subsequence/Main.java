#include<stdio.h>
int main()
{
int a,b[100],s=0,c[100],e=0,m=0;
  scanf("%d",&a);
  for(int i=0;i<a;i++)
  {
      scanf("%d",&b[i]);
  }
     s=s+b[0];
  for(int i=0;i<a;i++)
  {
 
    if(b[i+1]>b[i])
    {
      s=s+b[i+1];
    }
    else
    {
      c[e]=s;
      e++;
      s=0+b[i+1];
     
    }
   
       
  }
  
  m=c[0];
  for(int i=1;i<e;i++)
  {
    if(c[i]>m)
      m=c[i];
  }
         printf("%d \n",m);
  
  return 0;
}
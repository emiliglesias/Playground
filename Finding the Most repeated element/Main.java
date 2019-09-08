#include<stdio.h>
int main()
{
int a,b[100],s=1,c[100],e=0,m=0,p,q[100],l,f=0;
  scanf("%d",&a);
  for(int i=0;i<a;i++)
  {
      scanf("%d",&b[i]);
  }
   m=b[0];
  f++;
  for(int i=1;i<=a;i++)
  {
    
    if(m==b[i])
    {
  s++;
      
    }
    else
    {
      c[e]=s;
      q[e]=m;
      m=b[i];

      e++;
      s=1;
    
    }

  }
  p=c[0];
  for(int i=0;i<e;i++)
  {

  }
  for(int i=1;i<a;i++)
  {
    if(c[i]>p)
    {
      p=c[i];
     l=i;
    }
  
  }
  if(l<2)
           printf("%d\n",b[0]);
  else
       printf("%d\n",q[l]);
  return 0;
}
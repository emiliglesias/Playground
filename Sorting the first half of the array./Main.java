

#include <stdio.h>
int main()
{
int a[100],b,c,d,e;
 scanf("%d",&b);
  e=b;
  e=e/2;
  for(int i =0;i<b;i++)
{
   scanf("%d",&a[i]); 
}
for(int i =1;i<e;i++)
{

  d=i;
  c=a[i]; 
for(int j =i-1;j>=0;j--)
  {   
 
  if(c<a[j])
    {
      i--;
    }
 
}

a[d]=a[i];
 a[i]=c;
}
  
for(int i=0;i<b;i++)
{
 printf("%d ",a[i]); 
}
  
   return 0;
}
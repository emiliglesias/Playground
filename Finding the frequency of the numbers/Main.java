#include<stdio.h>
int main()
{
int a,b[100],k,e=0,c[100];
 scanf("%d",&a);
    scanf("%d",&k);
  for(int i=0;i<a;i++)
  {
      scanf("%d",&b[i]);
 }
  for(int i=1;i<=k;i++)
  {
    for(int j=0;j<a;j++)
    {
      if(b[j]==i)
      {
       e++;
       
      }
  
    }
         c[i-1]=e;   
    e=0;
  }

   for(int i=0;i<k;i++)
  {
    printf("%d %d\n",i+1,c[i]);
   }
  
 
  return 0;
}

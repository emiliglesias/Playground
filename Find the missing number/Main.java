#include <stdio.h>
int main()
{
  char a[100];
   int b,f=0;
    scanf("%d\n",&b);
   for(int i=0;i<b;i++)
  {
     scanf("%d",&a[i]);
   }
  for(int i=1;i<=b;i++)
  {
  
for(int j=0;j<6;j++)
{
         if(a[j]==i)
         {
           f=1;
         }
}
    if(f==0)
    {
       printf("%d",i); 
    }
      f=0;
  }
   return 0;
}
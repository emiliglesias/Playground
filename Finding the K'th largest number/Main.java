#include<stdio.h>
int main()
{
int a,b[100],k,e;
  scanf("%d",&a);

  for(int i=0;i<a;i++)
  {
      scanf("%d",&b[i]);
 }
  
   scanf("%d",&k);
  for(int i=0;i<a-1;i++)
  {
    for(int j=0;j<a-1;j++)
    {
      if(b[j]>b[j+1])
      {
       e=b[j];
        b[j]=b[j+1];
        b[j+1]=e;
      }
    }
  }

    printf("%d ",b[a-k]);

 
  return 0;
}

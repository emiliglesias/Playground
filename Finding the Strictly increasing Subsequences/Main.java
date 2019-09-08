#include<stdio.h>
int main()
{
  int a[100],n,b[100],f=0,c=0,d;
  scanf("%d",&n);
   for(int i=0;i<=n;i++)
  {
        scanf("%d",&a[i]);
   }
  
  d=n;
  for(int i=0;i<n-1;i++)
  {
    for(int j=i+1;j<n;j++)
  {
     
    if(a[i]<a[j]&&a[j]>c)
    {
    
        printf("%d,%d\n",a[i],a[j]); 
     c=a[j];
    }
  }
    c=0;
 
 }
return 0;
}



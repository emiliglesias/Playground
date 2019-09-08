#include<stdio.h>
int main()
{
int n,num=0,c=0,s=0;
  
  scanf("%d",&n);
  while(n!=0)
  {
    c=n%10;
    s=s+c;
    n=n/10;
  }
  printf("%d",s);

}
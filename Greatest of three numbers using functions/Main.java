#include<stdio.h>
void main()
{
 int b,e,num,f,numg;
  scanf("%d%d%d",&b,&e,&f);
 num = change(b,e);
  numg =change(num,f);
 printf("%d",num);
}
int change(int m,int n)
{int g,h;
  if(m>n)
  {
   g=m ;
  }
 else
   g=n;
 return g;
}
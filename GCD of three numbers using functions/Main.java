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
{int g,h,i;
  for(i=1; i <= m && i <= n; ++i)
    {
     
        if(m%i==0 && n%i==0)
            g = i;
    }
 return g;
}
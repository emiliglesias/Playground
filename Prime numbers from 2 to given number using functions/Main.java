#include<stdio.h>
void main()
{
 int b,num;
  scanf("%d",&b);
  
  
 change(b);
}
int change(int m)
{
  int c,flag=0;
  for(c=2;c<=m;c++ )
  {
  for(int d=2;d<=(c/2);d++ )
  {
    if(c%d==0)
    {
     flag=1;
        break;
    }    
  }
    if(flag==0)
      printf("%d\n",c);
    flag=0;

  }
 return c;
}


#include <stdio.h>
#include <string.h>
int main()
{
char a[100],b[100];
  gets(a);
  int x,y=0,z=0,l=0,m,n,o;
x=strlen(a);
 scanf("%d",&l);

  m=(l%26);
  for(int i=0;i<x;i++)
  {
    if((a[i]>='a'&&a[i]<='z'))
       {
         a[i]= a[i]-(m);
       if( a[i] < 'a')
            {
                a[i] =  a[i] + 'z' - 'a' + 1;
            }
    }
  if((a[i]>='A'&&a[i]<='Z'))
  {
       a[i]= a[i]-(m);
      if( a[i] < 'A')
            {



                 a[i] =  a[i] + 'Z' - 'A' + 1;
            }
  }
  
        printf("%c",a[i]); 
  }
   printf("\n"); 
 
   return 0;
}


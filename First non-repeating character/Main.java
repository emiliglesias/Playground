#include<stdio.h>
#include<string.h>
int main()
{
char a[100],b[50];
  gets(a);
  int x=strlen(a);
   int o,f=0,n=0,z=0;
  int c[50];
  for(int i=0;i<26;i++)
  {
    c[i]=0;
  }
   for(int i=0;i<x-1;i++)
  {
     for(int j=0;j<x;j++)
  {
       if(a[i]==a[j])
       {
         if(i!=j)
         {
         z=1;
           n=1;
         }
       
       }
  }
     if(n==0)
     {
       f=1;
     }
     n=0;
    if(n==0)
     if(z==0)
     {
            
        printf("%c \n",a[i]);
       break;
     }
         z=0;
    
  }
   if(f==0)
     {
        printf("All the characters are repetitive");
      
     }

 
return 0;
}

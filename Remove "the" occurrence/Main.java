#include<stdio.h>
#include<string.h>
int main()
{
  char a[100],b[4],d[4]="the",r[4]="The";
 
  gets(a);
  int x=strlen(a);
   int o,f=0,n=0,z=0;
  int c[50];
   
  for(int i=0;i<x;i++)
  {  
    
   for(int j=i;j<i+3;j++)
  {
     b[f]=a[j];
     f++;
  }
    f=0;
 
    
  if((strcmp(b,d)==0)||(strcmp(b,r)==0))
    {   
    
      i=i+4;
    }
      
      printf("%c",a[i]);
  }
return 0;
}
















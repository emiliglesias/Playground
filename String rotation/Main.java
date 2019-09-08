
#include<stdio.h>
#include<string.h>
int main()
{
 int k,v=0; 
  char n[100],m[100];
 gets(n);
   gets(m);
  k=strlen(n);
   int g=k;

   for(int i=0;i<k;i++)
   {
  char l=n[0];
 
     
  for(int a=1; a<k;a++)
  {
   
    n[a-1]=n[a];
     
  }
     
  n[k-1]=l;
      if(strcmp(n,m)==0)
    {
      v=1;
          
      break;
    }
         
   }
  if(v==1)
     printf("Yes");
  else
     printf("No");
return 0;
}
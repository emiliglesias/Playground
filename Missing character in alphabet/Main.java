#include<stdio.h>
#include <string.h>
int main()
{
char a[100],b[100];
      int same=0;
  gets(a);
  
  int c[26];
   int d[26];
  int string1_len = strlen(a);

  for(int i=0; i<26;i++)
  {
     c[i]=1;
  }
   for(int i=0; i<26;i++)
  {
     d[i]=0;
  }
   for(int i=0; i<string1_len;i++)
  {
   if(a[i]>='a'&&a[i]<='z')
   {
     int offset=a[i]-'a';
     c[offset]=0;
   }
      if(a[i]>='A'&&a[i]<='Z')
   {
     int offset=a[i]-'A';
     c[offset]=0;
   }
  }
   for(int i=0; i<26;i++)
  {
     d[i]=c[i];
  }
   
    for(int i=0; i<26;i++)
  {
   if( c[i] ==1)
   {
     c[i]=i+'a';
     printf("%c ",c[i]);
   }
  }
 
    
 
return 0;
}

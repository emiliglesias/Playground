 #include<stdio.h>
#include<string.h>
int main()
{
 int k,v=0,q,j=0; 
  char n[100],m[100],y[10],h[100],s[100],f[100],o[10]=" ",u[100],z[100],p[100];
  int x=-1;
 gets(n);
   gets(m);
  gets(f);
  k=strlen(m);
  q=strlen(n);
   int g=k;
   for(int i=0;i<q-k+1;i++)
   {  
  for(int a=i; a<k+i;a++)
  {          
    u[v]=n[a];
    v++; 
  }    
     v=0;
j=strcmp(u,m);
      x++;       
      if(j==0)
    {  
        if(x==0)
        {         
          strcpy(s,f);                                   
     for(int b=x+k; b<q;b++)
  {
      z[j]=n[b];
       j++;
     }
             
          j=0;
       strcat(s,z);
    printf("%s\n",s);
        }
   else
   {
       for(int b=0; b<q-k;b++)
  {
      p[j]=n[b];
       j++;
     }
        strcpy(s,f);
     j=0;
          strcat(p,s);
                       printf("%s\n",p);
   }
   
       
    
      } 
    
         
   }
 
  
return 0;
}










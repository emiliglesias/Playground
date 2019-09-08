#include<stdio.h>

void largest_elem(int list[],int size);


int main() {
   int size,list[10],i;
   
   scanf("%d",&size);

   for( i = 0; i < size ; i++)
   {
       scanf("%d",&list[i]);
   }
  
   largest_elem(list,size);
  
   return 0;  
}

 void largest_elem(int list[],int size)
 { 
     int i, batch1_sum = 0, batch2_sum = 0,l;
     l=list[0];
     for( i = 0; i < size ; i++)
     { 
      if(l<list[i])
      l=list[i];
     }  
    
     for( i = 0; i < size ; i++)
     { 
      if(list[i]==l)
      printf("%d",i);
     }  
     
 }
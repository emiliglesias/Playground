#include<stdio.h>

void right_rotate_odd_and_left_rotate_even(int list[],int size);


int main() {
   int size,list[20],i,iter;
   
   scanf("%d",&size);
   
   
   for( i = 0; i < size ; i++)
   {
       scanf("%d",&list[i]);
   }
   
   
   
   right_rotate_odd_and_left_rotate_even(list,size);
 
 
   return 0;  
}

 void right_rotate_odd_and_left_rotate_even(int list[],int size)
 {
     int i , j,c[50],l=0,k;
     int odd_temp,even_temp,odd_temp_idx,even_temp_idx;
 for( i = 0 ; i < size ; i++)
    {

    if(list[i]>0)
        {
            c[l]=list[i];
        l++;

        }
       
    }

    k=size-l-1;
    
   for( i = 0 ; i < k+1 ; i++ )
    {
     c[l]=0;
     l++;

   }
    for( i = 0; i < size ; i++)
   {
       printf("%d ",c[i]);
   }
  
 }
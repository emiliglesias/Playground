#include<stdio.h>
#include<stdlib.h>

int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i,k=0;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    
    int sum,l=1,s=0,ia;
    scanf("%d", &sum);
  for(i=0; i<size; i++)
    {
      for(ia=0; ia<size; ia++)
      {
        s=arr[i]+arr[ia];
         if(s==sum)
    {
             k++;
                
           if(k==1)
           {
      printf("Perfect couple: %d %d\n",arr[i],arr[ia]);
           }

    }
      
      }
   
    }
    
  if (k==0)
          printf("No perfect couple found!");
    return 0;
}


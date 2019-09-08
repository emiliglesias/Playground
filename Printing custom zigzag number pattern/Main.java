#include<stdio.h>
int main()
{
	int n,a=1,v=0,z=0;
    scanf("%d",&n);
  v=n;
	
   for (int row_no = 1; row_no <= n; row_no++) 
      {
     
    	    for(int star = 1; star<=(n); star++) 
          {
            if(row_no %2 !=0)
            {
              if(star==n)
                printf("%d",row_no+1);
              else
              printf("%d",row_no);
            }
              else
              {
                 if(star==1)
                printf("%d",row_no+1);
              else
              printf("%d",row_no);
              }
          
		  }
    
	    printf("\n");
    
	  }		
	return 0;
}

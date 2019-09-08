
#include<stdio.h>
int main()
{
	int n,m,y=0;
    scanf("%d",&n);

m=n;
for(int row_no = 1 ; row_no <= n ; row_no++)
      {
		
		for(int col_no = 1 ; col_no <=( n); col_no++)
           {
         
       
          {
            y=(n-col_no+1-row_no+1);
            if(y>0)
			 printf("%d",y);   
          }
		   }
 
  
		printf("\n");			
	 }
  
     return 0;
}
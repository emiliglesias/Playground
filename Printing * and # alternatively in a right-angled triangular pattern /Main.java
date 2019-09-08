
#include<stdio.h>
int main()
 {
     int n,m,t=0;
     scanf("%d %d",&n,&m);
	 for(int cur_row =1; cur_row <= n; cur_row++) 
          {
       m=cur_row;
			 for(int cur_col=1; cur_col <= m ; cur_col++) 
                {
               t++;
               if (t%2==0)
				  printf("#");
               else
                   printf("*");
			    }
		      printf("\n");
		   }
 }
#include <stdio.h>
int main() {
int n,m,o=0;
    scanf("%d",&m);
  
	for(int starcount = 1 ; starcount <= m ; starcount++) 
        {
      o++;
		   printf("%d",starcount);
      
       if(starcount%3==0)
         	   printf(",");
      }
    
	return 0;
}
#include<stdio.h>

void main() 
{ int r,c;
  scanf("%d",&r);
      scanf("%d",&c);
  int mat[r][c];
 for (int i = 0; i < r; i++)
  {
     for (int j = 0; j < c; j++)
     { 
      
       scanf("%d",&mat[i][j]);
     }

  }

   for (int i = 0; i < c; i++)
  {
     for (int j = 0; j < r; j++)
     { 
        printf("%d ",mat[j][i]);
     }
      printf("\n");
   }
}
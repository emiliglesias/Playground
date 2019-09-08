#include<stdio.h>

void main() 
{ int r,c;
  scanf("%d",&r);
      scanf("%d",&c);
  int mat[r][c],b[r][c];
 for (int i = 0; i < r; i++)
  {
     for (int j = 0; j < c; j++)
     { 
      
       scanf("%d",&mat[i][j]);
     }

  }
for (int i = 0; i < r; i++)
  {
     for (int j = 0; j < c; j++)
     { 
      
       scanf("%d",&b[i][j]);
     }

  }

   for (int i = 0; i < r; i++)
  {
     for (int j = 0; j < c; j++)
     {  
       mat[i][j]=mat[i][j]-b[i][j];
        printf("%d ",mat[i][j]);
     }
      printf("\n");
   }
}
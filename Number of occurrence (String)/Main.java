#include<stdio.h>
#include<string.h>
void main()
{
  char str1[1000],str2[1000];

  gets(str1);

  gets(str2);
  int str1_len = strlen(str1);
  int str2_len = strlen(str2);
  int matching_idx = -1,g=0;
  
    for (int i = 0; i < (str1_len); i++)
    {
      if(str1[i]>='a'&&str1[1000]<='z')
        str1[i]=str1[i]-32;
    }
   
    
       for (int i = 0; i < (str2_len); i++)
    {
      if(str2[i]>='a'&&str2[1000]<='z')
        str2[i]=str2[i]-32;
    }
 
  
  
  
  
  for (int i = 0; i < (str1_len - str2_len + 1); i++)
    {
      int is_matching = 1;
      for(int j = 0; j < str2_len; j++)
      {
        if(str1[i + j]!= str2[j])
        {
          is_matching = 0;
        }
      }
      if(is_matching == 1)
      {
        matching_idx = i;
          g++;
     
      }
    }
    printf("%d\n", g);
}
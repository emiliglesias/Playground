/*#include<stdio.h>
#include<string.h>
void main()
{
  char str1[1000],str2[1000];

  gets(str1);


  int str1_len = strlen(str1);

  int matching_idx = -1,g=0,i,c=0;
 
    printf("\n");
  for (int z =0; z<=3; z++)
  {
  
  for (i = str1_len-1; (str1[i]!=' '&&(i>0)); i--)
    {
  g++;
         
  }
   for (int j =i+1; j<=i+g+1-1; j++)
    {
  
  printf("%c",str1[j]);
   
 
  }
    
  printf(" ");
  str1_len=str1_len-g-1;
    c++;
  g=0;
    i=0;
       
}

    printf("%c",str1[0]); 
}*/






#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size
int main()
{
    char str[100], reverse[100];
    int len, i, index, wordStart, wordEnd;
    gets(str);
    len   = strlen(str);
    index = 0;
   // Start checking of words from the end of string
    wordStart = len - 1;
    wordEnd   = len - 1;
    while(wordStart > 0)
    {
        // If a word is found
        if(str[wordStart] == ' ')
        {
            // Add the word to the reverse string
            i = wordStart + 1;
            while(i <= wordEnd)
            {
                reverse[index] = str[i];

                i++;
                index++;
            }
            reverse[index++] = ' ';
            wordEnd = wordStart - 1;
        }
      wordStart--;
    }
    // Finally add the last word
    for(i=0; i<=wordEnd; i++)
    {
        reverse[index] = str[i];
        index++;
    }
    // Add NULL character at the end of reverse string
    reverse[index] = '\0'; 
    printf("%s", reverse);
    return 0;
}























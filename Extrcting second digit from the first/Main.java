#include <stdio.h>
int main() {
	int n,num=0,c=0,s=0;
  
  scanf("%d",&n);
  while(n>100)
  {
    n=n/10;
  }
  s=n%10;
  printf("%d",s);
	return 0;
}
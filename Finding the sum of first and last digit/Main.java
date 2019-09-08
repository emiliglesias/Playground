#include <stdio.h>
int main() {
int n,num=0,c=0,s=0;
  
  scanf("%d",&n);
  num=n%10;
  while(n>10)
  {
    n=n/10;
  }
  s=n;
  c=n+num;
  printf("%d",c);
	return 0;
}
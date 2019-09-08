#include <stdio.h>
int main() {
	int a,n,b=1;
  scanf("%d",&n);
  for(a=1;b<=n;a++)
  {
    if(a%2==1)
    {
      printf("%d\n",a);
    b++;
    }
  }
  
	return 0;
}
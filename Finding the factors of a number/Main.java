#include <stdio.h>
int main() {
int a;
  scanf("%d",&a);
  for(int b=1;b<=(a);b++)
  {
    if(a%b==0)
      printf("%d\n",b);
  }
	return 0;
}

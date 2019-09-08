
#include<stdio.h>

int sum_of_last3_digits(int num)
 {
  int sod = (num*num);  
  return sod;
 }
int main()
 {
  int n1;
  scanf("%d",&n1);
  int sod1 = sum_of_last3_digits(n1);

  printf("%d \n",sod1);
 
}
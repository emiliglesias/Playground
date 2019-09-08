 #include<stdio.h>
void main()
{
    int arr_size,arr[10],flag=0,a,b;
    scanf("%d",&arr_size);
   for(int i =0; i < arr_size; i++)
   {
       scanf("%d",&arr[i]);
   }
  scanf("%d%d",&a,&b);
  
    for(int i =0; i < arr_size; i++)
    {
 if(arr[i]==a)
 {
 printf("%d\n",i);
 }
      if(arr[i]==b)
      {
        flag=1;
 printf("%d\n",i);
      }

    }   
  if(flag==0)
     printf("-1");

}
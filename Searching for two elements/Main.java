import java.util.Scanner;
class Main{
    public static void main(String args[]){
       int a,b,d; // Type your code here
      int c[] = new int[10];
      Scanner in=new Scanner(System.in);
      a=in.nextInt();
      for(int i=0;i<a;i++)
      {
       c[i]=in.nextInt();
      }
      b=in.nextInt();
         d=in.nextInt();
          System.out.println(+index(c,a,b));
       System.out.println(index(c,a,d));
    }
  public static int index(int c[],int a,int b)
  {int g=-1;
      for(int i=0;i<a;i++)
      {
        if(c[i]==b)
  g=i;
      }
   return g;
  }
}
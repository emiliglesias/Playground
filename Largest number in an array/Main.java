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

     

       System.out.println(index(c,a));
    }
  public static int index(int c[],int a)
  {int g=0;
      for(int i=0;i<a;i++)
      {
        if(c[i]>g)
        {
        g=c[i];
        }
      }
   return g;
  }
}
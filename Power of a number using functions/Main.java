import java.util.Scanner;
class Main{

public static void main(String[] args)
{
  Scanner in=new Scanner(System.in);
  int b= in.nextInt();
    int e =in.nextInt();
  int c=Power_of_a_number(b,e);
  System.out.println(c);
}
  public static int Power_of_a_number(int b, int e)
  {
    int p=1;
    while(e!=0)
    {
      p=p*b;
      e--;
     
    }
     return p;
  }
}

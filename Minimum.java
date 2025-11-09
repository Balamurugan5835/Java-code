import java.util.Scanner;
class Minimum

{
   public static void main(String[] args)
   {
    Scanner ip=new Scanner(System.in);
    int n1=ip.nextInt();
    int n2=ip.nextInt();
    int min;
    if(n1<n2)
    min=n1;
    else
    min=n2;
    System.out.printf("minimum of %d,%d is %d",n1,n2,min);

   }
}
import java.util.Scanner;
class count

{
  public static void main(String[] args) {
    Scanner ip=new Scanner (System.in);
    int num=ip.nextInt();
    int co=0;
    if(num==0)
    co=1;
    else
    {
        while(num!=0)
        {
            num=num/10;
            co++;

        }
    }
    System.out.println(co);
  }
}
import java.util.Scanner;
class Leap
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int year=ip.nextInt();
        if((year%400==0)||(year%4==0&&year%100!=0))
        System.out.println("leap year");
        else
        {
            System.out.println("not leap year");
        }
    }

}
import java.util.Scanner;
class harzardnumber
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        int sum=0,copynum=num;
        while(num!=0)
        {
            int dig=num%10;
            num=num/10;
            sum=sum+dig;

        }
        if(copynum%sum==0)
        {
            System.out.println("Yes");
        }
        else{ 
            System.out.println("No");
        }
        ip.close();
    }
}